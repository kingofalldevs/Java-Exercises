package com.Hashmaps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Diana");
        map.put(2,"Beauty");
        map.put(3,"Sammy");
        map.put(4,"Baron");
        map.put(5,"Joseph");

        System.out.print(map);
        map.remove(3);
        System.out.println(map);
        System.out.println(map.get(5));
        System.out.println(map.containsValue("Diana"));



    }
}
