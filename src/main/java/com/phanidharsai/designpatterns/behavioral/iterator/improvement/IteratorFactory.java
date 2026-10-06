package com.phanidharsai.designpatterns.behavioral.iterator.improvement;


public class IteratorFactory {

    public static Iterator<Notification> create(
            IteratorType type,
            NotificationList list) {

        switch (type) {
            case FORWARD:
                return new ForwardIterator(list);

            case REVERSE:
                return new ReverseIterator(list);

            case SHUFFLE:
//                return new ShuffleIterator(list);

            default:
                throw new IllegalArgumentException("Unknown iterator type");
        }
    }
}