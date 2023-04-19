package it.alexius33.designpatterns.creational.factory.model;

public class QualityChefKnife extends Knife {

    @Override
    public void sharpen() {
        System.out.println("Sharpening quality chef knife..");
    }

    @Override
    public void cut() {
        System.out.println("Cutting with the quality chef knife");
    }
}
