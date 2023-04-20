package it.alexius33.designpatterns.structural.decorator;

public class AuthenticatedWebPage extends WebPageDecorator {

    public AuthenticatedWebPage(WebPage page) {
        super(page);
    }

    public void authenticateUser() {
        System.out.println("Authenticating user");
    }

    @Override
    public void display() {
        super.display();
        this.authenticateUser();
    }
}
