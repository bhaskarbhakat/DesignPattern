package com.example.designpatterns.factoryPattern.practicalFactory.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Sparrow extends Bird{
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
