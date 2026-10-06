package com.phanidharsai.designpatterns.behavioral.iterator.solution;

import java.util.NoSuchElementException;

public class ReverseIterator implements Iterator<Notification> {
    private final NotificationList list;
    private int position;

    public ReverseIterator(NotificationList list) {
        this.list = list;
        this.position = list.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public Notification next() {
        if (!hasNext()) throw new NoSuchElementException();
        return list.get(position--);
    }

    @Override
    public void reset() { position = list.size() - 1; }
}