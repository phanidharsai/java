package com.phanidharsai.designpatterns.behavioral.state.solution;

public class OrderContext {
    private OrderState currentState;
    private String id;
    private String status;

    // initialization with id and starting state
    public OrderContext(String id){
        this.id = id;
        this.currentState = new OrderedState();
    }
    public void setState(OrderState orderState){
        this.currentState= orderState;
    }
    public void nextStep(){
        currentState.nextState(this);
    }
    public String getStatus(){
        return currentState.getStatus();
    }
}
