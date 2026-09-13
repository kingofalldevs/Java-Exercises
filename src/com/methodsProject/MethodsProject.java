package com.methodsProject;

import java.util.Scanner;

public class MethodsProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance covered: ");
        double distance = input.nextDouble();
        System.out.print("Enter the time used: ");
        double time = input.nextDouble();
        System.out.print("Enter initial velocity");
        double initialVelocity = input.nextDouble();
        System.out.print("Enter initial velocity");
        double finalVelocity = input.nextDouble();
        System.out.print("What was the time taken: ");
        double timeTaken =input.nextDouble();


        double speed = speedFunc(distance, time);
        double acc = acceleration(initialVelocity,finalVelocity,timeTaken);
        System.out.println(speed);
        System.out.println(acc);

        input.close();
    }

    public static double speedFunc(double distance, double time ) {
      return distance/time;
    }

    public static double acceleration(double initialVelocity, double finalVelocity, double timeTaken) {
        return (initialVelocity-finalVelocity)/timeTaken;

    }
}
