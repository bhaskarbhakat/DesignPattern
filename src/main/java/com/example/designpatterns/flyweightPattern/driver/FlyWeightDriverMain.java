package com.example.designpatterns.flyweightPattern.driver;

import com.example.designpatterns.flyweightPattern.model.Bullet;
import com.example.designpatterns.flyweightPattern.model.BulletType;
import com.example.designpatterns.flyweightPattern.model.FlyingBullet;

public class FlyWeightDriverMain {
    public static void main(String[] args) {
        Bullet sniperBullet = new Bullet(
                BulletType.SNIPER_RIFFLE,
                90,
                new Byte[]{1, 0, 1},
                10,
                "Black",
                "High",
                1.5
        );

        FlyingBullet flyingBullet1 = new FlyingBullet(23,94,-39,100,320,-39, sniperBullet);
        System.out.println(flyingBullet1.getBullet().getDamage());
        System.out.println(flyingBullet1.getBullet().getType());
        System.out.println(flyingBullet1.getBullet().getColor());

        FlyingBullet flyingBullet2 = new FlyingBullet(10, 5, 0, 1, 0, 0, sniperBullet);
        System.out.println(flyingBullet2.getBullet().getDamage());
        System.out.println(flyingBullet2.getBullet().getType());
        System.out.println(flyingBullet2.getBullet().getColor());
    }
}
