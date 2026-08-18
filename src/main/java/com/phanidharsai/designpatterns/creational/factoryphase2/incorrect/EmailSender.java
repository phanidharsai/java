package com.phanidharsai.designpatterns.creational.factoryphase2.incorrect;

public class EmailSender implements NotificationSender {

    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending email to " + recipient);
    }
}