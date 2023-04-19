package it.alexius33.designpatterns.creational.factory.store;

import it.alexius33.designpatterns.creational.factory.model.Knife;
import it.alexius33.designpatterns.creational.factory.model.KnifeType;

public abstract class KnifeStore {

    public Knife orderKnife(KnifeType knifeType) {
        final Knife knife = createKnife(knifeType);
        knife.sharpen();
        return knife;
    }

    abstract Knife createKnife(KnifeType knifeType);
}
