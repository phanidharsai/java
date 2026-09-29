package com.phanidharsai.designpatterns.creational.abstractfactory;


public class NotificationService {

    public void notifyUser(NotificationType type, String recipient, String message) {
    NotificationSender notificationSender = NotificationSenderFactory.create(type);
    notificationSender.send(recipient, message);
    }
}