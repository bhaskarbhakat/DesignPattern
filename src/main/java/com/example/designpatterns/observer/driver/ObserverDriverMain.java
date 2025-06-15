package com.example.designpatterns.observer.driver;

import com.example.designpatterns.observer.model.User;
import com.example.designpatterns.observer.model.YoutubeChannel;

public class ObserverDriverMain {

    public static void main(String[] args) {
        YoutubeChannel mrBeast = new YoutubeChannel("ID101", "MrBeast", "Money minded", "User1383", 0);

        User bhaskar = new User("User1234", "bhaskar", "bhaskarbhakat40@gmail.com");
        User lucky = new User("User1235", "lucky", "lucky40@gmail.com");

        mrBeast.registerObserver(bhaskar);
        mrBeast.registerObserver(lucky);

        System.out.println("New video is uploaded : Mr Beast Channel");
        System.out.println(">>> Notify all the subscriber");
        mrBeast.setTotalVideos(1);
        System.out.println(">>> All subscriber got notified");
    }
}
