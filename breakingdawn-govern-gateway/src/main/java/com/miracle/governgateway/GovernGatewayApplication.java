package com.miracle.governgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GovernGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GovernGatewayApplication.class,args);
    }
}
