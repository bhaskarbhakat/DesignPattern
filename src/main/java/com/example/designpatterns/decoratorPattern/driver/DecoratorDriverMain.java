package com.example.designpatterns.decoratorPattern.driver;

import com.example.designpatterns.decoratorPattern.decorator.*;

public class DecoratorDriverMain {
    public static void main(String[] args) {
        IceCream dragonChocoIce = new CherryTopping(new BlueBerryTopping(new OrangeCone(new ChocolateScoop(new ChocolateCone()))));
        System.out.println(dragonChocoIce.getPrice());
        System.out.println(dragonChocoIce.getDescription());
    }
}
