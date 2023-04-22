package it.alexius33.designpatterns.behavioural.observer;

public class Subscriber implements Observer {

    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.printf("%s received new update!\n", this.name);
    }
}
