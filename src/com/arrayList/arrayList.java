package com.arrayList;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        // create the list
        ArrayList<String> students = new ArrayList<>();
        //add elements
        students.add("Kofi");
        students.add("Ama");
        students.add("Adwoa");
        students.add("Efia");
        students.add("Kojo");

        System.out.println(students.get(0));
        System.out.println(students.set(0,"Prince"));
        System.out.println(students.get(0));
        System.out.println(students.size());

        for (int i =0; i < students.size();i++){
            System.out.println(students.get(i));
        }



    }
}
