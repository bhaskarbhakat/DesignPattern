package com.example.designpatterns.factoryPattern.factoryMethod.factory;

import com.example.designpatterns.factoryPattern.factoryMethod.models.*;

public class BirdFactory {
    public static Bird getBirdObject(BirdType birdType) {
        return switch (birdType) {
            case PARROT -> Parrot.createObject();
            case PEACOCK -> Peacock.createObject();
            case SPARROW -> Sparrow.createObject();
            default -> throw new IllegalArgumentException("Invalid bird type");
        };
    }
}
