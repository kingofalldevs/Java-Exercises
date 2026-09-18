package com.InventoryRestocker;

public class Item {
    private String name;
    private int quantity;

    Item(String name, int quantity){
        this.setName(name);
        this.setQuantity(quantity);
    }

    public String getName() {return name;}

    public int getQuantity() {return quantity;}

    public void setName(String name) {this.name = name;}

    public void setQuantity(int quantity) {this.quantity = quantity;}

    void whatItem(){
        System.out.println("Item Details : "+quantity+ " "+ name);
    }

}
