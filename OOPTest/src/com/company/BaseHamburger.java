package com.company;

public class BaseHamburger extends Hamburger {
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean cheese;
    private double basePrice;
    private double priceLettuce = 1;
    private double priceTomato = 1;
    private double priceCarrot = 1;
    private double priceCheese = 3;


    public BaseHamburger(boolean lettuce, boolean tomato, boolean carrot, boolean cheese) {
        super("NormalBread",true);
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.cheese = cheese;
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
        return totalPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

}
