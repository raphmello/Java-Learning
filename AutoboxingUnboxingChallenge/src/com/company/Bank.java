package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branches> branchesList;

    public Bank(String name) {
        this.name = name;
        this.branchesList = new ArrayList<Branches>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branches> getBranchesList() {
        return branchesList;
    }

    public void addNewBranch(String accountNumber) {
        int position = findBranch(accountNumber);
        if(position>=0) {
            System.out.println("Branch number already exists.");
        } else {
            branchesList.add(new Branches(accountNumber));
        }
    }

    public void newCustomer(String name, double initialDeposit,String branchNumber) {
        Customers newCustomer = new Customers(name);
        Branches branch = new Branches(branchNumber);
        int position = findBranch(branch.getAccountNumber());
        if(position>=0) {
            branchesList.get(position).addNewCustomer(newCustomer);
            branchesList.get(position).addTransaction(newCustomer,initialDeposit);
        } else {
            System.out.println("Branch not found.");
        }

    }

    public int findBranch(String accountNumber) {
        for(int i = 0;i < branchesList.size();i++) {
            if(branchesList.get(i).getAccountNumber().equals(accountNumber)) {
                return i;
            }
        }
        return -1;
    }

    public void newTransaction(Branches branch,Customers currentCustomer,double value) {
        int branchFound = findBranch(branch.getAccountNumber());
        if(branchFound>=0) {
            int customerFound = branchesList.get(branchFound).findCustomer(currentCustomer.getName());
            if(customerFound>=0) {
                branchesList.get(branchFound).getCustomersList().get(customerFound).addTransaction(value);
                System.out.println("Transaction executed --> " + value + ".");
                System.out.println("Transactions --> " +
                        branchesList.get(branchFound).getCustomersList().get(customerFound).getTransactions().toString());
            } else {
                System.out.println("Customer not found.");
            }
        } else {
            System.out.println("Branch not found.");
        }
    }

    public void listOfCustomers(Branches branch,boolean transactionList) {
        int branchFound = findBranch(branch.getAccountNumber());
        if(branchFound>=0) {
            branchesList.get(branchFound).printCustomers(transactionList);
        } else {
            System.out.println("Branch not found.");
        }
    }

}
