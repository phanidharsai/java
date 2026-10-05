package com.phanidharsai.designpatterns.behavioral.observer.phase2;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        market.getEvents().subscribe("priceChange", new PriceAlertListener(150.0));
        market.getEvents().subscribe("priceChange", new DashboardListener());
        market.getEvents().subscribe("newStock", new DashboardListener());

        market.addStock("APSL", 10000.0);
        market.updatePrice("AAPL", 155.0);
        // Output:
        // ⚠️ ALERT: AAPL exceeded $150.0
        // 📊 Dashboard updated: AAPL:155.0
    }
}