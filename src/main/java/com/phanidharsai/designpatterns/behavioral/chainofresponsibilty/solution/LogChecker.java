package com.phanidharsai.designpatterns.behavioral.chainofresponsibilty.solution;

public class LogChecker extends RequestHandler{
    @Override
    protected boolean checkRequest(String request) {
        System.out.println("in Log checker");
        if(request.contains("log")){
            return true;
        }
        return false;
    }
}
