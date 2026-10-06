package com.phanidharsai.designpatterns.behavioral.observer.phase2.pushmodel;

import com.phanidharsai.designpatterns.behavioral.observer.phase2.EventManager;

import java.util.HashMap;
import java.util.Map;

public class StockMarket {
    private final EventManager events;
    private Map<String, Double> prices = new HashMap<>();

    public StockMarket() {
        this.events = new EventManager("priceChange", "newStock");
    }

    public void addStock(String symbol, double price){
        prices.put(symbol, price);
        events.notify("newStock", symbol + ":" + price);
    }

    public void updatePrice(String symbol, double newPrice) {
        prices.put(symbol, newPrice);
        events.notify("priceChange", symbol + ":" + newPrice);
    }

    public EventManager getEvents() {
        return events;
    }
}