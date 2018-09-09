package com.example.firstcloudprovider.controller;


import com.example.firstcloudprovider.entity.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class FristController {

    @GetMapping(value = "/person/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(@PathVariable("id") Integer id, HttpServletRequest request) {


        Person person = new Person(id, "tracy", 24, request.getRequestURL().toString());

        System.out.println(request.getRequestURL().toString());

        return person;

    }

}
