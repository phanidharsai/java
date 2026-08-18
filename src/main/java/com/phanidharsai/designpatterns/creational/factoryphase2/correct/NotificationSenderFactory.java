package com.phanidharsai.designpatterns.creational.factoryphase2.correct;


public class NotificationSenderFactory {
    public static NotificationSender create(NotificationType type) {
        return switch (type) {

            case SMS -> new SmsSender();

            case PUSH -> new PushSender();

            case EMAIL -> new EmailSender();

            default -> throw new IllegalArgumentException(
                    "Unsupported notification type: " + type
            );
        };
    }
}
