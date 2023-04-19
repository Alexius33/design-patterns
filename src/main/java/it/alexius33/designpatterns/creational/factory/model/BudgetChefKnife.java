package it.alexius33.designpatterns.creational.factory.model;

public class BudgetChefKnife extends Knife {

    @Override
    public void sharpen() {
        System.out.println("Sharpening budget chef knife..");
    }

    @Override
    public void cut() {
        System.out.println("Cutting with the budget chef knife");
    }
}
