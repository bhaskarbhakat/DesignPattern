package com.example.designpatterns.decoratorPattern.base;

public class MangoCone implements IceCream {
    @Override
    public String getDescription() {
        return "MangoCone";
    }

    @Override
    public Double getCost() {
        return 50.00;
    }
}
