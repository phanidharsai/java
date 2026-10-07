package com.phanidharsai.designpatterns.behavioral.state.solution;

public class Main {
    public static void main(String[] args){
        OrderContext newOrder = new OrderContext("123");
        newOrder.nextStep();
        newOrder.nextStep();
    }
}
