package com.phanidharsai.designpatterns.behavioral.chainofresponsibilty.solution;

public class Main {
    public static void main(String[] args){
        String request = "authorizationratelimitnotexceededlogvalidpayload";
        RequestHandler handler = new AuthChecker();
//        handler.linkWith(new RateLimitChecker()).linkWith(new LogChecker());
        boolean status=handler.checkRequest(request);
        if(status == true){
            handler = handler.linkWith(new RateLimitChecker());
            handler.checkRequest(request);
        }
//        handler.checkRequest(request);
    }
}
