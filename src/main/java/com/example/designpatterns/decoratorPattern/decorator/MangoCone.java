package com.example.designpatterns.decoratorPattern.decorator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class MangoCone implements IceCream {

    private IceCream iceCream;

    @Override
    public int getPrice() {
        if (iceCream!=null) {
            return iceCream.getPrice() + 60;
        }
        return 60;
    }

    @Override
    public String getDescription() {
        if (iceCream!=null) {
            return iceCream.getDescription() + ", Mango Cone";
        }
        return ", Mango Cone";
    }
}
