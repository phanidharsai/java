package com.phanidharsai.designpatterns.behavioral.iterator.solution;

public interface IterableCollection<T> {
    Iterator<T> createIterator();
    Iterator<T> createReverseIterator();
}