package com.miracle.manage_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan("com.miracle.manage_system.dao*")
public class ManageSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageSystemApplication.class, args);
    }
}
