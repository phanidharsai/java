package com.phanidharsai.designpatterns.behavioral.observer.phase2.pullmodel;

public class Main {
    public static void main(String[] args){
        WeatherStation ws = new WeatherStation();
        PhoneDisplay show = new PhoneDisplay();
        ws.addObserver(show);
        ws.setMeasurements(40.0,20.0);
    }
}
