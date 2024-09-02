package org.example;

public interface Prototype<T> {
    public T clone();
    public T deepClone();
}
