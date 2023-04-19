package it.alexius33.designpatterns.creational.singleton.example;

import it.alexius33.designpatterns.creational.singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        final Singleton firstInstance = Singleton.getInstance();
        firstInstance.instanceMethod();

        final Singleton secondInstance = Singleton.getInstance();
        secondInstance.instanceMethod();

        if (firstInstance == secondInstance) {
            System.out.println("Instances are the same!");
        } else {
            throw new RuntimeException("Instances are not the same!");
        }
    }
}
