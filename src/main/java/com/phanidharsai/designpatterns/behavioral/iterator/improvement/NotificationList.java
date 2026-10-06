package com.phanidharsai.designpatterns.behavioral.iterator.improvement;

public class NotificationList  {
    private final Notification[] notifications;
    private int count = 0;

    public NotificationList(int capacity) {
        this.notifications = new Notification[capacity];
    }

    public void addNotification(Notification notification) {
        if (count < notifications.length) {
            notifications[count++] = notification;
        }
    }

    public int size() { return count; }
    public Notification get(int index) { return notifications[index]; }

}