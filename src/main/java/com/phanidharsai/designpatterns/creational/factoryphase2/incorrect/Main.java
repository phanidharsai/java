package com.phanidharsai.designpatterns.creational.factoryphase2.incorrect;

public class Main {

    public static void main(String[] args) {

        NotificationService notificationService =
                new NotificationService();

        notificationService.notify(
                "EMAIL",
                "phanidhar@example.com",
                "Your payment was successful"
        );

        notificationService.notify(
                "SMS",
                "+919876543210",
                "Your payment was successful"
        );

        notificationService.notify(
                "PUSH",
                "USER-12345",
                "Your payment was successful"
        );
    }
}