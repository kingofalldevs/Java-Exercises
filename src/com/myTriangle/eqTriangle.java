package com.myTriangle;

public class eqTriangle {
    public static void main(String[] args) {
        triangle();

    }

    public static void triangle() {
        int rows = 5;
        for(int i= 1, j = 4; i < 10 && j < rows; j--, i+= 2){
            System.out.println("\t\t\t"+" ".repeat(j) + "*".repeat(i));
        }
        System.out.println();
    }
}




