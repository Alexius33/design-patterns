package it.alexius33.designpatterns.creational.singleton;

public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void instanceMethod() {
        System.out.println("Instance method called from " + this);
    }
}
