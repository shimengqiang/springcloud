package com.example.firstcloudinvoker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//有能力去发现服务
@EnableDiscoveryClient
@SpringBootApplication
public class FirstCloudInvokerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstCloudInvokerApplication.class, args);
    }
}
