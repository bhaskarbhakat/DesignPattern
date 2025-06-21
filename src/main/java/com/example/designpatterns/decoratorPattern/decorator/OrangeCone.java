package com.example.designpatterns.decoratorPattern.decorator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class OrangeCone implements IceCream {

    private IceCream iceCream;

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
            return iceCream.getDescription() + ", Orange Cone";
        }
        return "Orange Cone";
    }
}
