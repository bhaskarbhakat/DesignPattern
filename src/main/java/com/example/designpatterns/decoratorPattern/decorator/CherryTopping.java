package com.example.designpatterns.decoratorPattern.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CherryTopping implements IceCream {

    private IceCream iceCream;


    @Override
    public int getPrice() {
        return iceCream.getPrice()+30;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Cherry Topping";
    }
}
