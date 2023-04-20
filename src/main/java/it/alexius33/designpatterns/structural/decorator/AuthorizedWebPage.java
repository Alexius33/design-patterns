package it.alexius33.designpatterns.structural.decorator;

public class AuthorizedWebPage extends WebPageDecorator {

    public AuthorizedWebPage(WebPage page) {
        super(page);
    }

    public void authorizeUser() {
        System.out.println("Authorizing user");
    }

    @Override
    public void display() {
        super.display();
        this.authorizeUser();
    }
}
