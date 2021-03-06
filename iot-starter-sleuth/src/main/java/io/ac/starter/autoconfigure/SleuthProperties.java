package io.ac.starter.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description:
 * @author: yangtg
 * @create: 2020-02-18
 **/
@ConfigurationProperties(prefix = "spring.application")
public class SleuthProperties {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public static final String SWAGGER_URI1 = "swagger";
    public static final String SWAGGER_URI2 = "api-docs";
}
