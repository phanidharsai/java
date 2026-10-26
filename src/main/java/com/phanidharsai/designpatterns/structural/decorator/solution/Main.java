package com.phanidharsai.designpatterns.structural.decorator.solution;

public class Main {
    public static void main(String[] args){
        Coffee base = new Espresso();
        System.out.println(base.getDescription());
        System.out.println(base.getPrice());
        base = new MilkDecorator(base);
        System.out.println(base.getDescription());
        System.out.println(base.getPrice());
        base = new FoamDecorator(base);
        System.out.println(base.getDescription());
        System.out.println(base.getPrice());
    }
}
