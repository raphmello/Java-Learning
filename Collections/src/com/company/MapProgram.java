package com.company;

import java.util.HashMap;
import java.util.Map;




public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.printf("Java already exists");
        } else {
            languages.put("Java", "a compiled high level language");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "an interpreted, high level progm languages");
        languages.put("Algol","an algorithmic language");
        System.out.println(languages.put("BASIC","Beginners All Purpose Symbolic Instructions Code"));
        System.out.println(languages.put("LISP","Therein lies madness"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java","this course is about java");
        }

        System.out.println("========================================");

//        languages.remove("LISP");
        if (languages.remove("Algol","an algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if (languages.replace("LISP","Therein lies madness","A functional programming language")) {
            System.out.println("LISP replaced");
        } else {
            System.out.println("LISP was not replaced");
        }
//        System.out.println(languages.replace("Scala","this will not be added"));
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
