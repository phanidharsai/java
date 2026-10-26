package com.phanidharsai.designpatterns.structural.decorator.solution;

public abstract class CoffeeDecorator implements Coffee{
    protected final Coffee coffeeToBeDecorated;

    protected CoffeeDecorator(Coffee coffeeToBeDecorated) {
        this.coffeeToBeDecorated = coffeeToBeDecorated;
    }

    @Override
    public String getDescription() {
        return coffeeToBeDecorated.getDescription();
    }

    @Override
    public double getPrice() {
        return coffeeToBeDecorated.getPrice() ;
    }
}
