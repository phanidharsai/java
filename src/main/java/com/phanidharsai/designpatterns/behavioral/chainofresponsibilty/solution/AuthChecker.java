package com.phanidharsai.designpatterns.behavioral.chainofresponsibilty.solution;

public class AuthChecker implements RequestChecker{
    @Override
    public void nextStep(RequestHandler requestHandler,String request) {
        if(request.contains("auth")){
            System.out.println("passed to ratelimit");

        }
    }
}
