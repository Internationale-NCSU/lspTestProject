package org.example;

public interface Iterator<T> {
    boolean hasNext();
    void next();
    T current();
}
//implements Iterator<String>
//implements Iterator<User>