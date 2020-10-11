package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java","a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }
        languages.put("Python","high level with dynamic semantics");
        languages.put("Algol","an algorithmic language");
        System.out.println(languages.put("Basic","Beginners all purposes symbolic instruction code "));
        System.out.println(languages.put("Lisp","Therein lies madness"));

        System.out.println(languages.get("Java"));
        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            System.out.println(languages.put("Java","new description"));

        }
        System.out.println(languages.get("Java"));

        System.out.println("===============================================");

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
