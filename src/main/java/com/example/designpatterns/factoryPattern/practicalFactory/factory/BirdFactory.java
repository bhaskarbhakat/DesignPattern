package com.example.designpatterns.factoryPattern.practicalFactory.factory;

import com.example.designpatterns.factoryPattern.practicalFactory.models.*;

public class BirdFactory {

    public Bird getBirdObject(BirdType birdType){
        if (birdType.equals(BirdType.PEACOCK)) {
            return new Peacock();
        }
        else if (birdType.equals(BirdType.DUCK)) {
            return new Duck();
        }
        else if (birdType.equals(BirdType.SPARROW)) {
            return new Sparrow();
        }
        else if (birdType.equals(BirdType.PARROT)) {
            return new Parrot();
        }
        throw new IllegalArgumentException("Unknown bird type");
    }
}
