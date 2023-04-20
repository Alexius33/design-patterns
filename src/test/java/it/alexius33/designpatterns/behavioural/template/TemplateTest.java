package it.alexius33.designpatterns.behavioural.template;

import org.junit.jupiter.api.Test;

class TemplateTest {

    @Test
    void test() {
        System.out.println("Making spaghetti meatballs");
        final SpaghettiMeatballs spaghettiMeatballs = new SpaghettiMeatballs();
        spaghettiMeatballs.makeRecipe();

        System.out.println();

        System.out.println("Making penne Alfredo");
        final PenneAlfredo penneAlfredo = new PenneAlfredo();
        penneAlfredo.makeRecipe();
    }
}
