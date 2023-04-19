package it.alexius33.designpatterns.creational.factory.store;

import it.alexius33.designpatterns.creational.factory.model.Knife;
import it.alexius33.designpatterns.creational.factory.model.KnifeType;
import it.alexius33.designpatterns.creational.factory.model.QualityChefKnife;
import it.alexius33.designpatterns.creational.factory.model.QualitySteakKnife;

public class QualityKnifeStore extends KnifeStore {

    @Override
    Knife createKnife(KnifeType knifeType) {
        switch (knifeType) {
            case STEAK:
                return new QualitySteakKnife();
            case CHEF:
                return new QualityChefKnife();
            default:
                throw new IllegalArgumentException("Unknown knifeType: " + knifeType);
        }
    }
}
