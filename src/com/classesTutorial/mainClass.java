package com.classesTutorial;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {

        car car = new car();

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);






    }
}
