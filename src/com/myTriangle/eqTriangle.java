package com.myTriangle;

//This program uses methods and loops to print and equilateral triangle
public class eqTriangle {
    public static void main(String[] args) {
        //this is the triangle method
        triangle();

    }

    public static void triangle() {
        int rows = 5;
        // i declared rows = 5 because i need 5 rows and in that 5 rows i needed
        // a perfect triangle formed from it \t's adds some space which pushes
        // the whole triangle to the right and the repeat func is used to repeat items as shown in the for loop below
        for(int i= 1, j = 4; i < 10 && j < rows; j--, i+= 2){
            System.out.println("\t\t\t"+" ".repeat(j) + "*".repeat(i));
        }
        System.out.println();
    }
}




