package it.alexius33.designpatterns.structural.proxy;

import java.util.List;

public class OrderFulfillment implements IOrder {

    private final List<Warehouse> warehouses;

    public OrderFulfillment(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    @Override
    public void fulfillOrder(Order order) {
        for (Warehouse warehouse : warehouses) {
            boolean canFulfillOrder = true;
            for (Item item : order.getItemList()) {
                if (warehouse.currentInventory(item) == 0) {
                    canFulfillOrder = false;
                    break;
                }
            }
            if (canFulfillOrder) {
                System.out.println("Warehouse: " + warehouse.getAddress() + " can fulfill order");
                warehouse.fulfillOrder(order);
                break;
            } else {
                System.out.println("Warehouse: " + warehouse.getAddress() + " could not fulfill order");
            }
        }
    }
}
