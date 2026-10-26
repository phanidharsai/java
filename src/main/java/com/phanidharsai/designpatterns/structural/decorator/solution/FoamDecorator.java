package com.phanidharsai.designpatterns.structural.decorator.solution;

public class FoamDecorator extends CoffeeDecorator {
    public FoamDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription(){
        return coffeeToBeDecorated.getDescription() + " + " + "foam";
    }
    public double getPrice(){
        return coffeeToBeDecorated.getPrice() + 150.0;
    }
}
