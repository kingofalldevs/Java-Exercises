package com.arrayTrial;

import java.util.Scanner;


public class ClassProgram {
    //we want this program to accept the names of students in a class
    // accept their scores input output them and then again find the
    // highest score the lowest and the class average
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the class: ");
        int classSize = input.nextInt();
        input.nextLine();


        int[] scores = new int[classSize];
        String[] students = new String[classSize];
        acceptInput( students, classSize, input,scores);
        disOutput(students,scores,classSize);
        int max = checkMax(scores, classSize);
        int min = checkMin(scores,classSize);
        System.out.println("The maximum score is "+ max);
        System.out.println("The minimum score is "+ min);



    }

    public static void acceptInput(String[] students, int classSize, Scanner input, int[] scores) {
        for (int i = 0; i < classSize; i++) {
            System.out.print("Enter the name of student " + (i + 1) + " :");
            students[i] = input.nextLine();
            System.out.print("Enter the score of student " + (i + 1) + " :");
            scores[i] = input.nextInt();
            input.nextLine();
        }

    }
    // method to print out the output
    public static void disOutput(String[] students, int[] scores, int classSize) {
        System.out.println("\t\t\t Class Report");
        System.out.println("--------------------------------");
        System.out.printf("\t%-15s%-10s%n", "Name", "Score");
        System.out.println("--------------------------------");
        for (int i = 0;i< classSize;i ++){
            System.out.printf("\t%-15s%-10d%n", students[i], scores[i]);
        }
        System.out.println("_________________________________");
    }

    //checking for the max using loop and if
    public static int checkMax(int[] scores, int classSize) {
        int max = scores[0];
        for (int i = 1; i < classSize; i++){
            if (scores[i] > max){
                max = scores[i];
            }
        }
        return  max;
    }

    public static int checkMin(int[] scores, int classSize) {
        int min = scores[0];
        for (int i = 1; i < classSize; i++){
            if (scores[i] < min){
                min = scores[i];
            }
        }
        return  min;
    }


}