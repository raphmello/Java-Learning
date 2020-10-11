package com.company;

public class Main {

    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(SomeClass.getClassCounter());


        int pw = 674312;
        Password password = new ExtendedPassword(pw);
        password.storePassword();
        password.letMeIn(674312);
        password.letMeIn(1);
        password.letMeIn(0);


        SIBTeste sibTeste = new SIBTeste();
        sibTeste.someMethod();
        System.out.println(SIBTeste.owner);
    }
}
