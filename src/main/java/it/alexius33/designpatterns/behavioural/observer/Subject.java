package it.alexius33.designpatterns.behavioural.observer;

import java.util.LinkedList;
import java.util.List;

public abstract class Subject {

    private final List<Observer> observers;

    public Subject() {
        this.observers = new LinkedList<>();
    }

    public void register(Observer observer) {
        this.observers.add(observer);
    }

    public void unregister(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
