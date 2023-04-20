package it.alexius33.designpatterns.behavioural.template;

public abstract class PastaDish {

    public final void makeRecipe() {
        boilWater();
        addPasta();
        cookPasta();
        drain();
        plate();
        addSauce();
        addProtein();
        addGarnish();
    }

    protected abstract void addPasta();
    protected abstract void addSauce();
    protected abstract void addProtein();
    protected abstract void addGarnish();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void cookPasta() {
        System.out.println("Cooking pasta");
    }

    private void drain() {
        System.out.println("Draining pasta");
    }

    private void plate() {
        System.out.println("Plating pasta");
    }
}
