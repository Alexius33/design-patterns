package it.alexius33.designpatterns.structural.decorator;

public class BasicWebPage implements WebPage {

    @Override
    public void display() {
        System.out.println("Basic web page");
    }
}
