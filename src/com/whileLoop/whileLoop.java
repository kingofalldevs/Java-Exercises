package com.whileLoop;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean activeSession = true;
        while (activeSession){
            System.out.println("Are you still Shopping?: ");
            String Useranswer = input.nextLine();

            if (Useranswer.equalsIgnoreCase("Yes")){
                System.out.println("Keep Shopping!");
            }else if (Useranswer.equalsIgnoreCase("No")){
                System.out.println("Exiting Application....");
                activeSession = false;
            }else {
                System.out.println("Invalid output please enter yes or no ");
            }

            System.out.println();

        }

        input.close();
    }
}
