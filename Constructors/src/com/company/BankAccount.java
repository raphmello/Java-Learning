package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount () {
        this("456",0.05,"No Name","No e-mail","No phone number");
        System.out.println("Constructor called");
    }

    public BankAccount (String accountNumber,double balance, String customerName, String email,
                        String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this. phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999",100,customerName,email,phoneNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit (double value) {
        if (value >= 0) {
            this.balance = this.balance + value;
            System.out.println("Balance now is " + getBalance());
        } else {
            System.out.println("Invalid Value for Deposit: " + value);
        }
    }
    public void withdraw (double value) {

        if (this.balance < value) {
            System.out.println("Insufficient Funds");
        } else if (value < 0) {
            System.out.println("Invalid Value for Withdrawal: " + value);
        } else {
            this.balance = this.balance - value;
            System.out.println("Balance now is " + getBalance());
        }
    }
}
