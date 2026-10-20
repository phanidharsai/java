package com.phanidharsai.designpatterns.behavioral.chainofresponsibilty.solution;

public class AuthChecker extends RequestHandler {

    @Override
    protected boolean checkRequest(String request) {
        System.out.println("in auth checker");
        if(request.contains("auth")){
            return true;
        }
        System.out.println("returned false");
        return false;
    }
}
