package com.methodsProject;

import java.util.Scanner;

public class MethodsProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance covered: ");
        double distance = input.nextDouble();
        System.out.println("Enter the time used: ");
        double time = input.nextDouble();

        double speed = speedFunc(distance, time);
        System.out.println(speed);

        input.close();
    }

    public static double speedFunc(double distance, double time ) {
      return distance/time;
    }
}
