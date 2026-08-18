package com.phanidharsai.designpatterns.creational.factoryphase2.correct;


public class NotificationService {

    public void notifyUser(NotificationType type,String recipient, String message) {
    NotificationSender notificationSender = NotificationSenderFactory.create(type);
    notificationSender.send(recipient, message);
    }
}