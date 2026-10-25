package com.phanidharsai.designpatterns.structural.decorator.solution;

public class Filter implements Coffee {
    @Override
    public String getDescription() {
        return "Filter base";
    }

    @Override
    public double getPrice() {
        return 150;
    }
}
