package com.example.designpatterns.factoryPattern.factoryMethod.models;

public class Sparrow extends Bird{

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public static Bird createObject() {
        return new Sparrow();
    }
}
