package it.alexius33.designpatterns.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    void test() {
        final Singleton firstInstance = Singleton.getInstance();
        firstInstance.instanceMethod();

        final Singleton secondInstance = Singleton.getInstance();
        secondInstance.instanceMethod();

        Assertions.assertEquals(firstInstance, secondInstance);
    }
}