package com.example.designpatterns.factoryPattern.factoryMethod.models;

public class Peacock extends Bird {

    @Override
    public void fly() {
        System.out.println("Peacock is flying");
    }

    public static Bird createObject() {
        return new Peacock();
    }
}
