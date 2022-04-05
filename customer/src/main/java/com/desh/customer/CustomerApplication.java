package com.desh.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients (
        basePackages= "com.deshservice.clients"
        )
@EnableEurekaClient
public class CustomerApplication {

    public static void main(String []args){

        SpringApplication.run(CustomerApplication.class, args);

    }

}
