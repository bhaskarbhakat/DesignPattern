package com.example.designpatterns.factoryPattern.factoryMethod.driver;

import com.example.designpatterns.factoryPattern.factoryMethod.factory.BirdFactory;
import com.example.designpatterns.factoryPattern.factoryMethod.models.Bird;
import com.example.designpatterns.factoryPattern.factoryMethod.models.BirdType;

public class factoryMethodDriverMain {

    public static void main(String[] args) {
        Bird parrot = BirdFactory.getBirdObject(BirdType.PARROT);
        Bird peacock = BirdFactory.getBirdObject(BirdType.PEACOCK);
        parrot.fly();
        peacock.fly();
    }
}
