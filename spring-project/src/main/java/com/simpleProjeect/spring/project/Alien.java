package com.simpleProjeect.spring.project;

import org.springframework.stereotype.Component;

@Component
public class Alien {
    private String name ="joana";
    private int age = 12;
    private String company = "Techno";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
}
