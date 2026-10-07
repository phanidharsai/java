package com.phanidharsai.designpatterns.behavioral.state.probelm;

public class Order {
    private String status = "PENDING";
    public void getStatus(){
        System.out.println(status);
    }

    public void nextStep() {
        if (status.equals("PENDING")) {
            status = "CONFIRMED";
        } else if (status.equals("CONFIRMED")) {
            status = "SHIPPED";
        } else if (status.equals("SHIPPED")) {
            status = "DELIVERED";
        } else if (status.equals("DELIVERED")) {
            System.out.println("Already delivered");
        }
    }

    public void cancel() {
        if (status.equals("PENDING") || status.equals("CONFIRMED")) {
            status = "CANCELLED";
        } else if (status.equals("SHIPPED")) {
            throw new IllegalStateException("Cannot cancel shipped order");
        }
        // Every method has these same if/else chains for EVERY state
    }
}