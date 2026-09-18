package com.InventoryRestocker;

import java.util.ArrayList;

public class mainApp {
    public static void main(String[] args) {
        Operations operations =  new Operations();
        Item item = new Item("tomato", 5);
        System.out.println(item.getName());
        System.out.println(item.getQuantity());


    }
    }

