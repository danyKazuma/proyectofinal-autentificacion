package com.nttdata.proyectofinal.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;



@Configuration
public class UserManagementServiceConfig {

    @Value("${usermanagement.baseurl}")
    private String userManagementBaseUrl;

    @Bean
    public UserManagementService userManagementService() {
        return new UserManagementServiceImpl(userManagementBaseUrl, restTemplate());
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}