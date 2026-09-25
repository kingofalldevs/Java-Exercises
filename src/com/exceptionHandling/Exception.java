package com.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    //exception = an event that occurs during the execution of
    // a program that disrupts the normal flow of the program
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        try {
            System.out.print("Enter a whole number to divide: ");
            int x = input.nextInt();

            System.out.print("Enter a whole number to divide: ");
            int y = input.nextInt();

            int z = x/y ;
            System.out.print( " Your Z "+ z);
        }
        catch (ArithmeticException e){
            System.out.println("You cant divide by zero");
        }
        catch (InputMismatchException f){
            System.out.println("Ensure you entered a number");
        }
        catch (java.lang.Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("This will always print");
            input.close();
        }


    }
}
