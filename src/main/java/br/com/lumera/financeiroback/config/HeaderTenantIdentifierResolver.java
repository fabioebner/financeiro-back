package br.com.lumera.financeiroback.config;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.security.Principal;

@Component
public class HeaderTenantIdentifierResolver implements CurrentTenantIdentifierResolver {
    private static Logger logger = LoggerFactory.getLogger(HeaderTenantIdentifierResolver.class.getName());
    @Value("${multitenant.tenantKey}")
    String tenantKey;

    @Value("${multitenant.defaultTenant}")
    String defaultTenant;


    @Override
    public String resolveCurrentTenantIdentifier() {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        if(requestAttributes != null) {
            logger.info("Verificando se tem usuario logado");
            Principal usuarioLogado = ((ServletRequestAttributes) requestAttributes).getRequest().getUserPrincipal();
            if (usuarioLogado != null) {
                logger.info("retornando nome do schema");
                return ((MyUser)((UsernamePasswordAuthenticationToken) usuarioLogado).getPrincipal()).getSchema();
            }
//        if (requestAttributes != null) {
//            String tenantId = (String) requestAttributes.getAttribute(tenantKey, RequestAttributes.SCOPE_REQUEST);
//            if (tenantId != null) {
//                return tenantId;
//            }
//        }
        }
        return defaultTenant;
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }
}
