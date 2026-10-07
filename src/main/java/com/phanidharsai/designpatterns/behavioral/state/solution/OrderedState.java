package com.phanidharsai.designpatterns.behavioral.state.solution;

public class OrderedState implements OrderState{

    @Override
    public void nextState(OrderContext orderContext) {
        System.out.println("Changing state from ordered to confirmed");
        orderContext.setState(new ConfirmedState());
    }

    @Override
    public String getStatus() {
        return "Ordered";
    }

}
