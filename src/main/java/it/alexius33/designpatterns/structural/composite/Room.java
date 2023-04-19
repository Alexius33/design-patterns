package it.alexius33.designpatterns.structural.composite;

public class Room implements IStructure {

    private final String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public void enter() {
        System.out.println("Entering: " + this.getName());
    }

    @Override
    public void exit() {
        System.out.println("Exiting: " + this.getName());
    }

    @Override
    public void location() {
        System.out.println("You're currently in " + this.getName());
    }

    @Override
    public String getName() {
        return this.name;
    }
}
