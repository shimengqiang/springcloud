package com.example.firstcloudinvoker.controller;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Configuration
@RestController
public class InvokerController {


    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }

    @GetMapping(value = "/router",produces = MediaType.APPLICATION_JSON_VALUE)
    public String router(){
        RestTemplate restTemplate = getRestTemplate();

        String forObject = restTemplate.getForObject("http://first-cloud-provider/person/1", String.class);

        return forObject;

    }

}