package com.example.designpatterns.decoratorPattern.decorator;

import com.example.designpatterns.decoratorPattern.base.IceCream;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CherryTopping extends IceCreamDecorator {

    public CherryTopping(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "-> Cherry Topping";
    }

    @Override
    public Double getCost() {
        return iceCream.getCost() + 20.0;
    }
}
