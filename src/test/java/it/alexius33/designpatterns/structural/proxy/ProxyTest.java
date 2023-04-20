package it.alexius33.designpatterns.structural.proxy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

class ProxyTest {

    @Test
    void test(){
        final HashMap<String, Integer> stock1 = new HashMap<>();
        stock1.put("125", 7);
        stock1.put("130", 1);
        final Warehouse warehouse1 = new Warehouse();
        warehouse1.setAddress("123 Street");
        warehouse1.setStock(stock1);

        final HashMap<String, Integer> stock2 = new HashMap<>();
        stock2.put("120", 5);
        stock2.put("125", 7);
        stock2.put("130", 1);
        final Warehouse warehouse2 = new Warehouse();
        warehouse2.setAddress("321 Street");
        warehouse2.setStock(stock2);

        final Order order = new Order();
        order.setItemList(Arrays.asList(
                new Item("120", "TV"),
                new Item("125", "Table"),
                new Item("130", "Phone"))
        );

        final OrderFulfillment orderFulfillment = new OrderFulfillment(Arrays.asList(warehouse1, warehouse2));
        orderFulfillment.fulfillOrder(order);
    }
}
