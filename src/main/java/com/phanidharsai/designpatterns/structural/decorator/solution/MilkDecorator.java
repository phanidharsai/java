package com.phanidharsai.designpatterns.structural.decorator.solution;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    public String getDescription(){
        return coffeeToBeDecorated.getDescription() + " + " + "milk";
    }
    public double getPrice(){
        return coffeeToBeDecorated.getPrice() + 100.0;
    }
}
