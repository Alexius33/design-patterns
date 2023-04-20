package it.alexius33.designpatterns.structural.proxy;

import java.util.List;

public class Order {

    private List<Item> itemList;

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
