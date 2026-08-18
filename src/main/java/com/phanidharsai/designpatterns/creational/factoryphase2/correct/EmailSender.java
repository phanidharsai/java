package com.phanidharsai.designpatterns.creational.factoryphase2.correct;


public class EmailSender implements NotificationSender {

    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending email to " + recipient);
    }
}