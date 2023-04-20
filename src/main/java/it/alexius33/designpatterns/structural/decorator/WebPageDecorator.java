package it.alexius33.designpatterns.structural.decorator;

public class WebPageDecorator implements WebPage {

    protected WebPage page;

    public WebPageDecorator(WebPage page) {
        this.page = page;
    }

    @Override
    public void display() {
        this.page.display();
    }
}
