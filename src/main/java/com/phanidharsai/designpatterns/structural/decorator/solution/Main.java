package com.phanidharsai.designpatterns.structural.decorator.solution;

public class Main {
    public static void main(String[] args){
        Coffee base = new Espresso();
        base = new MilkDecorator(base);
        base = new FoamDecorator(base);
        System.out.println(base.getDescription());
        System.out.println(base.getPrice());
    }
}
