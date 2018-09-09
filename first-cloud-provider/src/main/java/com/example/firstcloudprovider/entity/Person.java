package com.example.firstcloudprovider.entity;

public class Person {


    Integer id ;

    String name;

    Integer age;

    String msg;

    public Person(Integer id, String name, Integer age, String msg) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.msg = msg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
