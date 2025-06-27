package com.example.designpatterns.factoryPattern.practicalFactory.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Peacock extends Bird {

    @Override
    public void fly() {
        System.out.println("Peacock is flying");
    }
}
