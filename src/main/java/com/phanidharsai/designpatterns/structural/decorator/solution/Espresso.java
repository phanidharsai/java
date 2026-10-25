package com.phanidharsai.designpatterns.structural.decorator.solution;

public class Espresso implements Coffee {
    public Espresso(){
    }

    @Override
    public String getDescription() {
        return "Espresso base";
    }

    @Override
    public double getPrice() {
        return 200;
    }
}
