package com.example.designpatterns.builderPattern.driver;

import com.example.designpatterns.builderPattern.model.User;

public class BuilderDriverMain {

    public static void main(String[] args) {
        User user293 = User.getBuilder()
                .setAge(25)
                .setDob("22_05_2000")
                .setCity("Bangalore")
                .setEmail("bhaskarbhakat40@gmail.com")
                .setGender("Male")
                .setName("Bhaskar Bhakat")
                .setPhoneNumber("23432524112")
                .setState("Karnataka")
                .build();


        System.out.println(user293.getName());
        System.out.println(user293.getEmail());
        System.out.println(user293.getGender());
    }

}
