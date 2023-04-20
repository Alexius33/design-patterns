package it.alexius33.designpatterns.structural.decorator;

import org.junit.jupiter.api.Test;

class DecoratorTest {

    @Test
    void test() {
        WebPage page = new BasicWebPage();
        page = new AuthorizedWebPage(page);
        page = new AuthenticatedWebPage(page);
        page.display();
    }
}
