package com.phanidharsai.designpatterns.behavioral.state.solution;

public class ShippedState implements OrderState{
    @Override
    public void nextState(OrderContext orderContext) {
        System.out.println("Changing state from confirmed to shipped");
    }

    @Override
    public String getStatus() {
        return "Shipped";
    }
}
