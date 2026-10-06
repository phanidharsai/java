package com.phanidharsai.designpatterns.behavioral.observer.phase2.pullmodel;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) { observers.add(o);
    System.out.println("observer added");}
    public void removeObserver(Observer o) { observers.remove(o); }

    protected void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);  // Pass self — observer pulls what it needs
        }
    }
}