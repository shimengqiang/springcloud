package com.gilfoyle.fistekserviceinvoker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class FistEkServiceInvokerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FistEkServiceInvokerApplication.class, args);
    }
}
