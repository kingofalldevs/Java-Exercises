package com.classesTutorial;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {

        car car = new car();

        car.isRunning = true;
        car.start();
        car.stop();
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.price);
        System.out.println(car.isRunning);

    }
}
