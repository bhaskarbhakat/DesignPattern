package com.example.designpatterns.decoratorPattern.decorator;

import com.example.designpatterns.decoratorPattern.base.IceCream;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChocolateScoop extends IceCreamDecorator {

    public ChocolateScoop(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "-> Chocolate Scoop";
    }

    @Override
    public Double getCost() {
        return iceCream.getCost() + 40.0;
    }
}
