package com.phanidharsai.designpatterns.behavioral.iterator.problem;

public class NotificationRenderer {
    public void render(NotificationList list) {
        // Client must KNOW it's an array and how count works
        for (int i = 0; i < list.getCount(); i++) {
//            display(list.getNotifications()[i]);
        }
        // If NotificationList changes to a LinkedList? ALL clients break.
    }
}