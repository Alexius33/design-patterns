package it.alexius33.designpatterns.structural.proxy;

import java.util.Map;

public class Warehouse implements IOrder {

    private String address;
    private Map<String, Integer> stock;

    @Override
    public void fulfillOrder(Order order) {
        for (Item item : order.getItemList()) {
            final Integer availableItems = this.stock.get(item.getSku());
            this.stock.put(item.getSku(), availableItems - 1);
        }

        System.out.println("Fulfilling order for items: " + order.getItemList());
    }

    public int currentInventory(Item item) {
        return stock.getOrDefault(item.getSku(), 0);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStock(Map<String, Integer> stock) {
        this.stock = stock;
    }
}
