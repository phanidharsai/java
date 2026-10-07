package com.phanidharsai.designpatterns.behavioral.state.solution;

public class ConfirmedState implements OrderState{

    @Override
    public void nextState(OrderContext orderContext) {
        System.out.println("Changing from confirmed to shipped");
        orderContext.setState(new ShippedState());
    }

    @Override
    public String getStatus() {
        return "Confirmed";
    }
}
