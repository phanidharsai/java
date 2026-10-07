package com.phanidharsai.designpatterns.behavioral.chainofresponsibilty.solution;

public abstract class RequestHandler {
    private RequestChecker current;
    void RequestHandler(String request){
        this.current = new AuthChecker();
    }
    public void setChecker(String request){
        current.nextStep(this, request);
    }
}
