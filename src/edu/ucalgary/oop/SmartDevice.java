package edu.ucalgary.oop;

public abstract class SmartDevice<T> implements Observer {
    private T state;

    public void setState(T state){
        this.state = state;
    }

    public T getState(T state) {
        return state;
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }
    // TODO: Complete the rest of the class
}
