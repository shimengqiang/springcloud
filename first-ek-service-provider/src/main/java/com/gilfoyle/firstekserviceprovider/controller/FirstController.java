package com.gilfoyle.firstekserviceprovider.controller;


import com.gilfoyle.firstekserviceprovider.entity.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {


    @GetMapping(value = "/person/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(@PathVariable("id")String id){

        Person p = new Person(id, "mac", 25);
        return p;
    }


}
