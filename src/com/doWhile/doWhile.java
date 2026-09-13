package com.doWhile;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int increment = 5;
        do {
            System.out.print("what are you doing ");
            String userInput = input.nextLine();
            System.out.println(userInput);

            increment--;
        }while (increment > 0);
            System.out.print("Exiting ........");

    };
}
