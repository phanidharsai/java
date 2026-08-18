package com.phanidharsai.designpatterns.creational.factoryphase2.incorrect;

public class PushSender implements NotificationSender {

    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending push notification to " + recipient);
    }
}