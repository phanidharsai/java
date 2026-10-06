package com.phanidharsai.designpatterns.behavioral.iterator.improvement;

public class Main {
    public static void main(String[] args) {
        NotificationList list = new NotificationList(10);
        list.addNotification(new Notification("Welcome!"));
        list.addNotification(new Notification("New message"));
        list.addNotification(new Notification("Update available"));

        // Forward iteration
        System.out.println("📬 Latest notifications:");
        Iterator<Notification> it = IteratorFactory.create(IteratorType.FORWARD,list);
        while (it.hasNext()) {
            System.out.println("  → " + it.next().getText());
        }

        // Reverse iteration
        System.out.println("📬 Oldest first:");
        Iterator<Notification> reverse = IteratorFactory.create(IteratorType.REVERSE, list);
        while (reverse.hasNext()) {
            System.out.println("  → " + reverse.next().getText());
        }
    }
}