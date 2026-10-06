package com.phanidharsai.designpatterns.behavioral.iterator.solution;

public interface Iterator<T> {
    boolean hasNext();
    T next();
    void reset();
}
