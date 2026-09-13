package com.classesTutorial;

//this is a simple illustration of java classes
//we wanna create a list of items in the Apple Store but the problem is that we will write too many arrays
//for example apple 1 is 50 in quantity, apple 2 is 70; apple 3 is 40; we will need to create 6 different arrays
public class classesTutorial {
    public static void main(String[] args) {
        Item apple = new Item();
        apple.name = "apple 1";
        System.out.print(apple.name);
        apple.quantity = 50;
        System.out.print(apple.quantity);
    }

}

class Item{
        String name;
        int quantity;
}

