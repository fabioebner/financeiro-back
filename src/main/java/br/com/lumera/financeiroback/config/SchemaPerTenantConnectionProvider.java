package br.com.lumera.financeiroback.config;

import org.hibernate.HibernateException;
import org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class SchemaPerTenantConnectionProvider implements MultiTenantConnectionProvider {
    private static Logger logger = LoggerFactory.getLogger(SchemaPerTenantConnectionProvider.class.getName());

    @Autowired
    private FlywayConf flywayConf;
    @Value("${datasource.lumera.flyway.locationPublic}")
    private String locationPublic;
    @Value("${datasource.lumera.flyway.locationPrivate}")
    private String locationPrivate;

    private DataSource dataSource;
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        try {
            flywayConf.migrate(this.dataSource, locationPublic, "public");
            ResultSet retorno = dataSource.getConnection().createStatement().executeQuery("select schema_name from information_schema.schemata where schema_name ilike 'db_%'");
            while(retorno.next()){
                logger.info("migrando db: "+ retorno.getString("schema_name"));
                flywayConf.migrate(this.dataSource, locationPrivate, retorno.getString("schema_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getAnyConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

    @Override
    public void releaseAnyConnection(Connection connection) throws SQLException {
        connection.close();
    }

    @Override
    public Connection getConnection(String tenantIdentifier) throws SQLException {
        final Connection connection = this.getAnyConnection();
        try {
            connection.createStatement().execute("SET search_path to " + tenantIdentifier);
        } catch (SQLException e) {
            throw new HibernateException("Could not alter JDBC connection to specified schema [" + tenantIdentifier + "]",
                    e);
        }
        return connection;
    }

    @Override
    public void releaseConnection(String tenantIdentifier, Connection connection) throws SQLException {
        try {
            connection.createStatement().execute("SET search_path to public");
        } catch (SQLException e) {
            throw new HibernateException("Could not alter JDBC connection to specified schema [" + tenantIdentifier + "]",
                    e);
        }

        connection.close();
    }

    @Override
    public boolean supportsAggressiveRelease() {
        return true;
    }

    @Override
    public boolean isUnwrappableAs(Class unwrapType) {
        return false;
    }

    @Override
    public <T> T unwrap(Class<T> unwrapType) {
        return null;
    }
}