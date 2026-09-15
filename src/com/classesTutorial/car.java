package com.classesTutorial;

public class car {
    String make =   "Ford";
    String model = "Mustang";
    int year = 2026;
    double price = 58000;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You stat the engine ");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }
    void drive(){
        System.out.println("You drive the "+ model);
    }
    void brake(){
        System.out.println("You brake the "+ model);
    }


}
