package com.example.designpatterns.decoratorPattern.decorator;

public class ChocolateCone implements IceCream {

    private IceCream iceCream;

    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public ChocolateCone() {}

    @Override
    public int getPrice() {
        if (iceCream!=null) {
            return iceCream.getPrice() + 40;
        }
        return 40;
    }

    @Override
    public String getDescription() {
        if (iceCream!=null) {
            return iceCream.getDescription() + ", Chocolate Cone";
        }
        return "Chocolate Cone";
    }
}
