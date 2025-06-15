package com.example.designpatterns.decoratorPattern.decorator;

import com.example.designpatterns.decoratorPattern.base.IceCream;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShetafalScoop extends IceCreamDecorator {

    public ShetafalScoop(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "-> Shetafal Scoop";
    }

    @Override
    public Double getCost() {
        return iceCream.getCost() + 90.0;
    }
}
