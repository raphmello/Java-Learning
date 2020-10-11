package com.company;

public class HealthyBurger extends Hamburger {
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean cheese;
    private boolean bacon;
    private boolean onion;
    private double basePrice;
    private double priceLettuce = 1;
    private double priceTomato = 1;
    private double priceCarrot = 1;
    private double priceCheese = 3;
    private double priceBacon = 2;
    private double priceOnion = 2;


    public HealthyBurger(boolean lettuce, boolean tomato, boolean carrot, boolean cheese,boolean bacon,boolean onion) {
        super("BrownBread",true);
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.cheese = cheese;
        this.bacon = bacon;
        this.onion = onion;
        this.basePrice = 6;
    }

    public double getPrice() {
        double totalPrice = 0;
        totalPrice += getBasePrice();
        if (lettuce) {
            totalPrice += priceLettuce;
        }
        if (tomato) {
            totalPrice += priceTomato;
        }
        if (carrot) {
            totalPrice += priceCarrot;
        }
        if (cheese) {
            totalPrice += priceCheese;
        }
        if (bacon) {
            totalPrice += priceBacon;
        }
        if (onion) {
            totalPrice += priceOnion;
        }
        return totalPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

}
