package com.InventoryRestocker;

import java.util.ArrayList;
import java.util.Scanner;

public class operations {
    Scanner input = new Scanner(System.in);
    ArrayList<Item> itemsList = new ArrayList<>();


    void addItem(){
        System.out.println("Enter name of the item: ");
        String itemName = input.nextLine();
        System.out.println("Enter the quantity of the item: ");
        int quantity = input.nextInt();

        Item newItem = new Item(itemName, quantity);
        itemsList.add(newItem);

    }
    void listItems(){
        for (int i =0; i < itemsList.size(); i++){
            System.out.print((i+1)+". ");
            itemsList.get(i).whatItem();
            System.out.println();
        }

    }
    void removeItem(){
        listItems();
        System.out.print("Enter the No of item you wanna remove ");
        int userInput = input.nextInt();
        int targetIndex = userInput -1;
        String itemName = itemsList.get(targetIndex).name;

        if (targetIndex < 0 || targetIndex >= itemsList.size()){
            System.out.println("Please pick an item Number in the list");
        }else {
            System.out.println("");
        }
    }
}
