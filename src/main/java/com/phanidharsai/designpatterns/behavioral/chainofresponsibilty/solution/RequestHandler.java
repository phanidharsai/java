package com.phanidharsai.designpatterns.behavioral.chainofresponsibilty.solution;

public abstract class RequestHandler {
    private RequestHandler next;
    public RequestHandler linkWith(RequestHandler next){
        this.next = next;
        return next;
    }
    protected abstract boolean checkRequest(String request);
}
