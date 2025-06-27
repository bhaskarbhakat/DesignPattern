package com.example.designpatterns.factoryPattern.practicalFactory.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Duck extends Bird {
    @Override
    public void fly() {
        System.out.println("Duck can't fly");
    }
}
