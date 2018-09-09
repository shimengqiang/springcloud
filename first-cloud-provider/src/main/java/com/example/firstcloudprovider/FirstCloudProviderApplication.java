package com.example.firstcloudprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;

@EnableEurekaClient
@SpringBootApplication
public class FirstCloudProviderApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String port = sc.nextLine();
        System.out.println(port);
        System.out.println(port);
        System.out.println(port);
        System.out.println(port);
        System.out.println(port);
        System.out.println(port);

        new SpringApplicationBuilder(FirstCloudProviderApplication.class).properties("server.port="+port).run(args);
    }
}
