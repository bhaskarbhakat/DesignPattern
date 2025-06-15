package com.example.designpatterns.decoratorPattern.base;

public class ChocoCone implements IceCream {
    @Override
    public String getDescription() {
        return "ChocoCone";
    }

    @Override
    public Double getCost() {
        return 70.00;
    }
}
