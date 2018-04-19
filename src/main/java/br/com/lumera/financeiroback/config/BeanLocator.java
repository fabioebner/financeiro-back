package br.com.lumera.financeiroback.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanLocator {

    private static BeanLocator instance;

    @Autowired
    private ApplicationContext context;

    @PostConstruct
    protected void initialize() {
        instance = this;
    }

    /**
     * Looks up a bean of the given type.
     *
     * @param beanType
     *            the type to lookup
     * @return an autowired instance of the given type
     */
    public static <T> T find(Class<T> beanType) {
        return instance.context.getBean(beanType);
    }

}