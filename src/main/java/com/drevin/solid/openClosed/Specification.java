package com.drevin.solid.openClosed;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
