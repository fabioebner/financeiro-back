package br.com.lumera.financeiroback.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class MvcConfig implements WebMvcConfigurer {
    private static Logger logger = LoggerFactory.getLogger(MvcConfig.class.getName());
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        logger.info("Adicionando CORS");
        registry.addMapping("/**").allowedOrigins("*");
        registry.addMapping("/**").allowCredentials(true);
        registry.addMapping("/**").allowedMethods("POST", "GET", "HEAD", "OPTIONS", "PUT", "DELETE","UPDATE");
        registry.addMapping("/**").allowedHeaders("Content-Type", "Access-Control-Allow-Headers", "Authorization", "X-Requested-With");
        registry.addMapping("/**").exposedHeaders("Authorization","Pragma");

    }
}
