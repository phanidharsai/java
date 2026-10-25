package com.phanidharsai.designpatterns.structural.decorator.solution;

public class FoamDecorator extends CoffeeDecorator {
    public FoamDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription(){
        return decoratedCoffee.getDescription() + " + " + "foam";
    }
    public double getPrice(){
        return decoratedCoffee.getPrice() + 150.0;
    }
}
