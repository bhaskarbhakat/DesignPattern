package com.example.designpatterns.factoryPattern.factoryMethod.models;

public class Parrot extends Bird{

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    public static Bird createObject() {
        return new Parrot();
    }
}
