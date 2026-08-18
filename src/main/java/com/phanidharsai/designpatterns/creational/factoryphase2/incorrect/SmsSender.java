package com.phanidharsai.designpatterns.creational.factoryphase2.incorrect;

public class SmsSender implements NotificationSender {

    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient);
    }
}