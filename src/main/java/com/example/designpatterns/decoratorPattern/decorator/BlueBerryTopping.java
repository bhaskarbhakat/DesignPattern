package com.example.designpatterns.decoratorPattern.decorator;

public class BlueBerryTopping implements IceCream{
    private IceCream iceCream;

    public BlueBerryTopping(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getPrice() {
        return iceCream.getPrice() + 25;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Blue Berry Topping";
    }
}
