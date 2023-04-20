package it.alexius33.designpatterns.creational.factory;

import it.alexius33.designpatterns.creational.factory.model.Knife;
import it.alexius33.designpatterns.creational.factory.store.BudgetKnifeStore;
import it.alexius33.designpatterns.creational.factory.store.KnifeStore;
import it.alexius33.designpatterns.creational.factory.store.QualityKnifeStore;
import org.junit.jupiter.api.Test;

import static it.alexius33.designpatterns.creational.factory.model.KnifeType.CHEF;
import static it.alexius33.designpatterns.creational.factory.model.KnifeType.STEAK;

class FactoryTest {

    @Test
    void test() {
        System.out.println("Buying from budget store:");
        final KnifeStore budgetKnifeStore = new BudgetKnifeStore();

        final Knife budgetSteaKnife = budgetKnifeStore.orderKnife(STEAK);
        budgetSteaKnife.cut();

        final Knife budgetChefKnife = budgetKnifeStore.orderKnife(CHEF);
        budgetChefKnife.cut();

        ///////
        System.out.println();
        ///////

        System.out.println("Buying from quality store:");
        final KnifeStore qualityKnifeStore = new QualityKnifeStore();

        final Knife qualitySteaKnife = qualityKnifeStore.orderKnife(STEAK);
        qualitySteaKnife.cut();

        final Knife qualityChefKnife = qualityKnifeStore.orderKnife(CHEF);
        qualityChefKnife.cut();
    }
}