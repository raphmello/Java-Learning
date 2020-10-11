package com.company;

import java.util.ArrayList;

public class Branches {
    private String accountNumber;
    private ArrayList<Customers> customersList;

    public Branches(String accountNumber) {
        this.accountNumber = accountNumber;
        this.customersList = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public ArrayList<Customers> getCustomersList() {
        return customersList;
    }

    public void addNewCustomer(Customers newCustomer) {
        int position = findCustomer(newCustomer.getName());
        if(position>=0){
            System.out.println("Customer " + newCustomer.getName() +
                    " already exists in the branch " + this.accountNumber);
        } else {
            customersList.add(newCustomer);
            System.out.println(newCustomer.getName() + " added to the branch " + this.accountNumber + ".");
        }
    }

    public void initialDeposit(Customers newCustomer,double value) {
        int position = findCustomer(newCustomer.getName());
        if (position>=0) {
            customersList.get(position).addTransaction(value);
        } else {
            System.out.println("Customer not found");
        }
    }

    public void addTransaction(Customers currentCustomer, double value) {
        int position = findCustomer(currentCustomer.getName());
        if (position>=0) {
            customersList.get(position).addTransaction(value);
        } else {
            System.out.println("Customer not found");
        }
    }

    public int findCustomer(String name) {
        for(int i = 0;i < customersList.size();i++) {
            if(customersList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void printCustomers(boolean transactionList) {
        System.out.println("List of customers inside branch " + this.accountNumber + ":");
        for(int i = 0;i<customersList.size();i++) {
            System.out.print((i+1) + ". " + customersList.get(i).getName());
            if(transactionList==true) {
                System.out.print(" --> " + customersList.get(i).getTransactions().toString());
            }
            System.out.println(".");
        }
    }

}
