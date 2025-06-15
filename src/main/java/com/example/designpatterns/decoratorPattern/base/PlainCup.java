package com.example.designpatterns.decoratorPattern.base;

public class PlainCup implements IceCream {
    @Override
    public String getDescription() {
        return "PlainCup";
    }

    @Override
    public Double getCost() {
        return 40.00;
    }
}
