package com.phanidharsai.designpatterns.behavioral.observer.phase2.pullmodel;

public class WeatherStation extends Observable {
    private double temperature;
    private double humidity;

    public void setMeasurements(double temp, double humidity) {
        this.temperature = temp;
        this.humidity = humidity;
        notifyObservers();
    }

    public double getTemperature() { return temperature; }
    public double getHumidity() { return humidity; }
}