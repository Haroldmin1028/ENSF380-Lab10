package edu.ucalgary.oop;

public abstract class SmartDevice<T> implements Observer<T> {
    private T state;

    public void setState(T state){
        this.state = state;
    }

    public T getState() {
        return state;
    }

    @Override
    public abstract void update(String message);
    // TODO: Complete the rest of the class
}
