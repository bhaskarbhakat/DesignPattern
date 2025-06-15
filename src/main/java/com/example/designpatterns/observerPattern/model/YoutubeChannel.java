package com.example.designpatterns.observerPattern.model;

import com.example.designpatterns.observerPattern.interfaces.Observer;
import com.example.designpatterns.observerPattern.interfaces.Subject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class YoutubeChannel implements Subject {
    private String id;
    private String name;
    private String description;
    private List<Observer> subscribers = new ArrayList<>();
    private String ownerId;
    private Integer totalVideos;

    public YoutubeChannel(String id, String name, String description, String ownerId, Integer totalVideos) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ownerId = ownerId;
        this.totalVideos = totalVideos;
    }

    public void setTotalVideos(Integer totalVideos) {
        this.totalVideos = totalVideos;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        subscribers.forEach(observer -> observer.update("New Video arrived"));
    }
}
