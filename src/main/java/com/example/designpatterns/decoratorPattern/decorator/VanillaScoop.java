package com.example.designpatterns.decoratorPattern.decorator;

import com.example.designpatterns.decoratorPattern.base.IceCream;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VanillaScoop extends IceCreamDecorator {
    public VanillaScoop(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "-> Vanilla Scoop";
    }

    @Override
    public Double getCost() {
        return iceCream.getCost() + 55.0;
    }
}
