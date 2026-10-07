package com.phanidharsai.designpatterns.behavioral.chainofresponsibilty.problem;

public class RequestProcessor {
    boolean rateLimitExceeded = true;
    boolean isValidPayload = true;
    public void handleRequest(String request) {
        // All handling logic in ONE monolithic method
        if (request == null) {
            System.out.println("unauthorized");
        }
        if (rateLimitExceeded) {
            System.out.println("ratelimitexceeded");
        }
        if (!isValidPayload) {
            System.out.println("Invalid payload");
        }
        // Adding a new check? Modify THIS class. Reordering? Refactor THIS method.
//        processBusinessLogic(request);
    }
}