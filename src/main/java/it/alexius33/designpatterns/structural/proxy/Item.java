package it.alexius33.designpatterns.structural.proxy;

public class Item {

    private final String sku;
    private final String name;

    public Item(String sku, String name) {
        this.sku = sku;
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
