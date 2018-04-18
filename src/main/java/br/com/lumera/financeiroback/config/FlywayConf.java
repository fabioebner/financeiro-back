package br.com.lumera.financeiroback.config;

import org.flywaydb.core.Flyway;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * Created by fabioebner on 26/05/17.
 */
@Component
public class FlywayConf {

    public void migrate(DataSource datasource, String locations, String... schema){
        Flyway flyway = new Flyway();
        flyway.setDataSource(datasource);
        flyway.setBaselineOnMigrate(true);
        flyway.setValidateOnMigrate(true);
        flyway.setSqlMigrationPrefix("V");
        flyway.setLocations(locations);
        flyway.setSchemas(schema);
        flyway.migrate();
    }

}
