package com.phanidharsai.designpatterns.creational.factoryphase2.correct;


public class Main {

    public static void main(String[] args) {

        NotificationService notificationService =
               new NotificationService();

        notificationService.notifyUser(
                NotificationType.EMAIL,
                "phanidhar@example.com",
                "Your payment was successful"
        );

        notificationService.notifyUser(
                NotificationType.SMS,
                "+919876543210",
                "Your payment was successful"
        );

        notificationService.notifyUser(
                NotificationType.PUSH,
                "USER-12345",
                "Your payment was successful"
        );
    }
}