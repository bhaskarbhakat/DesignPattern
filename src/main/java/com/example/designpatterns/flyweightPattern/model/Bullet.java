package com.example.designpatterns.flyweightPattern.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
// Intrinsic data
public class Bullet {
    private BulletType type;
    private Integer damage;
    private Byte[] shape;
    private Integer weight;
    private String color;
    private String speed;
    private Double radius;
}
