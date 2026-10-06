package com.phanidharsai.designpatterns.behavioral.iterator.improvement;

public interface Iterator<T> {
    boolean hasNext();
    T next();
    void reset();
}
