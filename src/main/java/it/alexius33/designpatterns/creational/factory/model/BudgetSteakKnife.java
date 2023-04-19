package it.alexius33.designpatterns.creational.factory.model;

public class BudgetSteakKnife extends Knife {

    @Override
    public void sharpen() {
        System.out.println("Sharpening steak knife..");
    }

    @Override
    public void cut() {
        System.out.println("Cutting with the steak knife");
    }
}
