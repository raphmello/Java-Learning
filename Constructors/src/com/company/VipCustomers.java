package com.company;

public class VipCustomers {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomers() {
        this("Raphael",5000,"raph.mello@gmai.com");
    }

    public VipCustomers(String name, double creditLimit) {
        this(name,creditLimit,"No e-mail");
    }

    public VipCustomers(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
