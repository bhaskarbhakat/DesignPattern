package com.example.designpatterns.flyweightPattern.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
// Extrinsic data
public class FlyingBullet {
    private int coordinateX;
    private int coordinateY;
    private int coordinateZ;
    private int directionX;
    private int directionY;
    private int directionZ;
    private Bullet bullet;
}
