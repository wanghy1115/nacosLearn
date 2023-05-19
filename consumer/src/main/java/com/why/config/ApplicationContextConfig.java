package com.why.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced//需要在pom中添加spring-cloud-starter-loadbalancer注解
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
