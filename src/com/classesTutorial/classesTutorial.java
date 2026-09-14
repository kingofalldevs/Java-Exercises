package com.classesTutorial;

//this is a simple illustration of java classes
//we wanna create a list of items in the Apple Store but the problem is that we will write too many arrays
//for example apple 1 is 50 in quantity, apple 2 is 70; apple 3 is 40; we will need to create 6 different arrays
public class classesTutorial {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        p1.name = "Pikachu";
        p1.level = 10;

        Pokemon p2 = new Pokemon();
        p2.name = "Eve";
        p2.level = 20;

       // System.out.print(p1.name +" "+p1.level);
        p2.attack();
    }
}

