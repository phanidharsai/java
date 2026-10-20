package com.phanidharsai.designpatterns.behavioral.chainofresponsibilty.solution;

public class RateLimitChecker extends RequestHandler{
    @Override
    protected boolean checkRequest(String request) {
        System.out.println("in rate checker");
        if(request.contains("rate")){
            return true;
        }
        return false;
    }
}
