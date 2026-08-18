package com.phanidharsai.designpatterns.creational.factoryphase2.incorrect;

public class NotificationService {

    public void notify(
            String type,
            String recipient,
            String message) {

        if (type.equals("EMAIL")) {
            new EmailSender().send(recipient, message);

        } else if (type.equals("SMS")) {
            new SmsSender().send(recipient, message);

        } else if (type.equals("PUSH")) {
            new PushSender().send(recipient, message);

        } else {
            throw new IllegalArgumentException(
                    "Unsupported notification type"
            );
        }
    }
}