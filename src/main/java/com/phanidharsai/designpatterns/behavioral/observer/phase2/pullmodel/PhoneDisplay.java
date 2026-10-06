package com.phanidharsai.designpatterns.behavioral.observer.phase2.pullmodel;

public class PhoneDisplay implements Observer {
    @Override
    public void update(Observable subject) {
        if (subject instanceof WeatherStation ws) {
            System.out.println("📱 Phone: " + ws.getTemperature() + "°C");
        }
    }
}