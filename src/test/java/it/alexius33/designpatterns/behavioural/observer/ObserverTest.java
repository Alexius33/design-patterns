package it.alexius33.designpatterns.behavioural.observer;

import org.junit.jupiter.api.Test;

class ObserverTest {

    @Test
    void test() {
        final Subscriber bob = new Subscriber("Bob");
        final Subscriber alice = new Subscriber("Alice");
        final Subscriber jack = new Subscriber("Jack");

        final Blog blog1 = new Blog();
        final Blog blog2 = new Blog();

        blog1.register(bob);
        blog1.register(alice);
        blog1.notifyObservers();

        System.out.println();

        blog2.register(alice);
        blog2.register(jack);
        blog2.notifyObservers();

        System.out.println();
        blog2.unregister(alice);
        blog2.notifyObservers();
    }
}
