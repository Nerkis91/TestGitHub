package com.kcs.days.fourth;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("Andrius", 22);
        numbers.put("Jonas", 12);
        numbers.put("Kaziukas", 33);
        numbers.put("Andrius", 45);

        for (String s : numbers.keySet()){
            System.out.println("key: " + s + " value " + numbers.get(s));
        }
    }
}

