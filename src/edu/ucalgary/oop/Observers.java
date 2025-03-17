package edu.ucalgary.oop;

interface Observer<T> {
    void update(T message);
    void setState(T state);
    T getState();
}
