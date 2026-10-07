package com.phanidharsai.designpatterns.behavioral.state.solution;

public interface OrderState {
     void nextState(OrderContext orderContext);
     String getStatus();
}
