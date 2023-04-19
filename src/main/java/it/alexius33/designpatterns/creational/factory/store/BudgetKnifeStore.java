package it.alexius33.designpatterns.creational.factory.store;

import it.alexius33.designpatterns.creational.factory.model.BudgetChefKnife;
import it.alexius33.designpatterns.creational.factory.model.BudgetSteakKnife;
import it.alexius33.designpatterns.creational.factory.model.Knife;
import it.alexius33.designpatterns.creational.factory.model.KnifeType;

public class BudgetKnifeStore extends KnifeStore {

    @Override
    Knife createKnife(KnifeType knifeType) {
        switch (knifeType) {
            case STEAK:
                return new BudgetSteakKnife();
            case CHEF:
                return new BudgetChefKnife();
            default:
                throw new IllegalArgumentException("Unknown knifeType: " + knifeType);
        }
    }
}
