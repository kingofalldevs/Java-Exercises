package com.arrayTrial;

import java.util.Scanner;

public class ArrayTrial {
    // this is a simple array code to use loops to store
    // items in an array and then use another loop to print the items
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] students = new String[6];
        // this is the first loop for storing the names
        for (int i = 0; i < 6; i ++){
            //we ask the user 6 times and we sore it in the array
            System.out.print("what is the name of student "+(i+1)+" :");
            students[i] = input.nextLine();
        }

        System.out.println();
        //this second loop is for displaying the items
        for (int i = 0; i < 6; i ++){
            //the loop moves 6 times to print out every value in index
            // [i] at the moment
            System.out.print("The name of student "+(i+1)+" = "+ students[i]);
            System.out.println();
        }

    }
}
