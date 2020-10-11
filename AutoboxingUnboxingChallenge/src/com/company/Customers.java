package com.company;

import java.util.ArrayList;

public class Customers {
    private String name;
    private ArrayList<Double> transactions;

    public Customers(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double value) {
        transactions.add(value);
    }



}
