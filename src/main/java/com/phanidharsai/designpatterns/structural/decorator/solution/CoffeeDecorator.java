package com.phanidharsai.designpatterns.structural.decorator.solution;

public abstract class CoffeeDecorator implements Coffee{
    protected final Coffee decoratedCoffee;

    protected CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice() ;
    }
}
