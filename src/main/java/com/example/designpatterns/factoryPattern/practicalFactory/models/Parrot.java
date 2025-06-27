package com.example.designpatterns.factoryPattern.practicalFactory.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Parrot extends Bird {
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}
