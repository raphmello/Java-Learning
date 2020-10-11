package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("Dog",1,1,1,1);
        Dog Ayla = new Dog("Ayla",10,4,1,1,1,1,"long");
//
//        dog.eat();
//        Ayla.eat();
//
//        Ayla.walk();
//        Ayla.run();

        Animal cat = dog;
        System.out.println(dog.getName());
        System.out.println(cat.getName());

        dog.setName("Dog2");
        System.out.println(dog.getName());
        System.out.println(cat.getName());
        Animal.test = "aa";
        System.out.println(dog.test);
        System.out.println(Ayla.test);
    }
}
