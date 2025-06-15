package com.example.designpatterns.observerPattern.model;

import com.example.designpatterns.observerPattern.interfaces.Observer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User implements Observer {
    private String id;
    private String name;
    private String email;

    @Override
    public void update(String message) {
        System.out.println("User " + name + " received message: " + message);
    }
}
