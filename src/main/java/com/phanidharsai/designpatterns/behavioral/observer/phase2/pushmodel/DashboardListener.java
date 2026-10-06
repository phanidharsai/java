package com.phanidharsai.designpatterns.behavioral.observer.phase2;

public class DashboardListener implements EventListener {
    @Override
    public void update(String eventType, String data) {
        System.out.println("📊 Dashboard updated: " + data);
    }
}