package com.example.designpatterns.decoratorPattern.decorator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ChocolateScoop implements IceCream{

    private IceCream iceCream;

    @Override
    public int getPrice() {
        return iceCream.getPrice() + 80;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Chocolate Scoop";
    }
}
