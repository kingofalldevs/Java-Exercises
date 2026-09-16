package com.InventoryRestocker;

public class Item {
    String name;
    int quantity;

    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    void whatItem(){
        System.out.println("Item Details : "+quantity+ " "+ name);
    }

}
