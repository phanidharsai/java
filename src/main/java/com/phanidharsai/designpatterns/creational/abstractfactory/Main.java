package com.phanidharsai.designpatterns.creational.abstractfactory;


public class Main {

    public static void main(String[] args) {

        String type = System.getProperty("app.type", "Gmail");

        EmailFactory factory = switch (type) {
            case "Gmail"  -> new GmailFactory();
            case "yahoo" -> new YahooFactory();
            default -> throw new IllegalArgumentException("Unknown theme: " + type);
        };

        Application app = new Application(factory);
        app.renderUI();
    }
}