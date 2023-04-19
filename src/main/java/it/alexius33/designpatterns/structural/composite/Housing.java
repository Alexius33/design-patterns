package it.alexius33.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Housing implements IStructure {

    private final List<IStructure> structures;
    private final String address;

    public Housing(String address) {
        this.structures = new ArrayList<>();
        this.address = address;
    }

    public int addStructure(IStructure component) {
        this.structures.add(component);
        return this.structures.size() - 1;
    }

    public IStructure getStructure(int componentNumber) {
        return this.structures.get(componentNumber);
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
        System.out.println("You're currently in " + this.getName() + ". It has: ");
        this.structures.forEach(structure -> System.out.println("\t-" + structure.getName()));
    }

    @Override
    public String getName() {
        return this.address;
    }
}
