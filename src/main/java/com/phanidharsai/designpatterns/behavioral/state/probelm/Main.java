package com.phanidharsai.designpatterns.behavioral.state.probelm;

public class Main {
    public static void main(String[] args){
        Order newOrder = new Order();
        newOrder.getStatus();
        newOrder.nextStep();
        newOrder.getStatus();
    }
}
