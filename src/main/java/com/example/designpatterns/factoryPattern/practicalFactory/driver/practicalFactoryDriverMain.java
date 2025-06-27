package com.example.designpatterns.factoryPattern.practicalFactory.driver;

import com.example.designpatterns.factoryPattern.practicalFactory.factory.BirdFactory;
import com.example.designpatterns.factoryPattern.practicalFactory.models.Bird;
import com.example.designpatterns.factoryPattern.practicalFactory.models.BirdType;

// practical factory also known as simple factory
public class practicalFactoryDriverMain {

    public static void main(String[] args) {
        BirdFactory birdFactory = new BirdFactory();
        Bird sparrow = birdFactory.getBirdObject(BirdType.SPARROW);
        Bird parrot = birdFactory.getBirdObject(BirdType.PARROT);
        Bird duck = birdFactory.getBirdObject(BirdType.DUCK);
        sparrow.fly();
        parrot.fly();
        duck.fly();
    }
}
