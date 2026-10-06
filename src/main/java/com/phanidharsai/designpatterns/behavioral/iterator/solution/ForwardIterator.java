package com.phanidharsai.designpatterns.behavioral.iterator.solution;

import java.util.NoSuchElementException;

public class ForwardIterator implements Iterator<Notification> {
    private final NotificationList list;
    private int position = 0;

    public ForwardIterator(NotificationList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Notification next() {
        if (!hasNext()) throw new NoSuchElementException();
        return list.get(position++);
    }

    @Override
    public void reset() { position = 0; }
}