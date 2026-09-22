package com.Interfaces;

import java.util.HashMap;

public class Main {
    //Interface = a template that can be applied to a class
    //              similar to inheritance but specifies what a class has/can do
    //classes can apply more than one interface but inheritance only limited to one parent class

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
        hawk.hunt();
        rabbit.flee();
    }

}
