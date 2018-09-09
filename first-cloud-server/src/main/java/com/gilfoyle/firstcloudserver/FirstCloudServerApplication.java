package com.gilfoyle.firstcloudserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

@EnableEurekaServer
@SpringBootApplication
public class FirstCloudServerApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String profile = scanner.nextLine();

        new SpringApplicationBuilder(FirstCloudServerApplication.class).profiles(profile).run(args);
    }
}
