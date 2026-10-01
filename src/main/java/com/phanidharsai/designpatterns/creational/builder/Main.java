package com.phanidharsai.designpatterns.creational.builder;

public class Main {
    public static void main(String[] args){
        // if we do not use bike builder we have to provide each and every value for the object to be created
        // else we will get syntax error
        Bike bikeWithoutBuilder = new Bike("BMW","Naked",600,20.0);
        // using builder class we can create object with any of the chosen attributes and rest will have default values
        Bike bikeWithBuilder = new BikeBuilder().setMake("DUCATI").getbike();
        Bike bike = new Bike();
        System.out.println(bike);
        System.out .println(bikeWithBuilder);
        System.out .println(bikeWithoutBuilder);

    }
}
