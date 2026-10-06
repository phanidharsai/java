package com.phanidharsai.designpatterns.behavioral.observer.phase2;

public class PriceAlertListener implements EventListener {
    private final double threshold;

    public PriceAlertListener(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public void update(String eventType, String data) {
        String[] parts = data.split(":");
        double price = Double.parseDouble(parts[1]);
        if (price > threshold) {
            System.out.println("⚠️ ALERT: " + parts[0] + " exceeded $" + threshold);
        }
    }
}