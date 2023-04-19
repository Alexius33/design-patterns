package it.alexius33.designpatterns.creational.factory.model;

public class QualitySteakKnife extends Knife {

    @Override
    public void sharpen() {
        System.out.println("Sharpening quality steak knife..");
    }

    @Override
    public void cut() {
        System.out.println("Cutting with the quality steak knife");
    }
}
