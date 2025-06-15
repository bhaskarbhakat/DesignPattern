package com.example.designpatterns.decoratorPattern.driver;

import com.example.designpatterns.decoratorPattern.base.ChocoCone;
import com.example.designpatterns.decoratorPattern.base.IceCream;
import com.example.designpatterns.decoratorPattern.decorator.BlueBerryTopping;
import com.example.designpatterns.decoratorPattern.decorator.ChocolateScoop;
import com.example.designpatterns.decoratorPattern.decorator.VanillaScoop;

public class DecoratorDriverMain {
    public static void main(String[] args) {
        IceCream iceCream = new BlueBerryTopping(new ChocolateScoop(new VanillaScoop(new ChocoCone())));
        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}
