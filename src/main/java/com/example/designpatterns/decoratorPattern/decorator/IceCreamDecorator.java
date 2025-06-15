package com.example.designpatterns.decoratorPattern.decorator;

import com.example.designpatterns.decoratorPattern.base.IceCream;

public abstract class IceCreamDecorator implements IceCream {
    protected IceCream iceCream;
    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }
}