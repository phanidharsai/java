package com.phanidharsai.designpatterns.behavioral.iterator.problem;

public class NotificationList {
    private Notification[] notifications;
    private int count;

    // Exposing internals so clients can traverse
    public Notification[] getNotifications() { return notifications; }
    public int getCount() { return count; }
}