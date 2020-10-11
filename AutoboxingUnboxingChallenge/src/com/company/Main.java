package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank1 = new Bank("Santander");
    public static void main(String[] args) {
        instructions();

        boolean flag = true;

        while (flag) {
            System.out.print("Choose an option (enter 7 for list of options): ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    flag = false;
                    break;
                case 2:
                    addNewBranch();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    doTransaction();
                    break;
                case 5:
                    listOfCustomers();
                    break;
                default:
                    System.out.println("Enter a valid option.");
            }
        }

    }

    public static void instructions() {
        System.out.println("List of options: \n" +
                "1. Quit\n" +
                "2. Add new branch\n" +
                "3. Add new customer\n" +
                "4. New transaction\n" +
                "5. List of customers and transactions\n" +
                "7. Help (List of Options)");


    }

    public static void addNewBranch() {
        System.out.print("Enter the branch number: ");
        String branchNumber = scanner.nextLine();
        bank1.addNewBranch(branchNumber);
    }

    public static void addNewCustomer() {
        System.out.print("Enter the branch number: ");
        String branchNumber = scanner.nextLine();
        System.out.print("Enter the name of the customer: ");
        String newCustomer = scanner.nextLine();
        System.out.print("Enter the initial transaction value: ");
        double initialValue = scanner.nextDouble();
        scanner.nextLine();
        bank1.newCustomer(newCustomer,initialValue,branchNumber);
    }

    public static void doTransaction() {
        System.out.print("Enter the branch number: ");
        String branchNumber = scanner.nextLine();
        System.out.print("Enter the name of the customer: ");
        String name = scanner.nextLine();
        System.out.print("Enter the transaction value: ");
        double value = scanner.nextDouble();
        scanner.nextLine();
        bank1.newTransaction(new Branches(branchNumber),new Customers(name),value);
    }

    public static void listOfCustomers() {
        System.out.print("Enter the branch number: ");
        String branchNumber = scanner.nextLine();
        System.out.print("See transactions for each customer (Y/N): ");
        String seeTransactions = scanner.nextLine();
        seeTransactions = seeTransactions.toUpperCase();
        if (seeTransactions.equals("Y")) {
            bank1.listOfCustomers(new Branches(branchNumber),true);
        } else {
            bank1.listOfCustomers(new Branches(branchNumber), false);
        }
    }

}
