package com.company;

public class Main {

    public static void main(String[] args) {
        BaseHamburger baseHamburger = new BaseHamburger(true,false,false,true);
        System.out.println(baseHamburger.getPrice());
        HealthyBurger healthyBurger = new HealthyBurger(true,true,true,true,true,true);
        System.out.println(healthyBurger.getPrice());
    }
}
