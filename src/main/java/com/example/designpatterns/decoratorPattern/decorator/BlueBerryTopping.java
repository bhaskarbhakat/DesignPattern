package com.example.designpatterns.decoratorPattern.decorator;

import com.example.designpatterns.decoratorPattern.base.IceCream;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlueBerryTopping extends IceCreamDecorator {

    public BlueBerryTopping(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "-> Blue Berry Topping";
    }

    @Override
    public Double getCost() {
        return iceCream.getCost() + 50.00;
    }
}
