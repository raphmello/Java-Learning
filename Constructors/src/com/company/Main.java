package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount raphael = new BankAccount();//"1234", 0.00,"Raphael","myemail@email.com","13 997674572");
        raphael.deposit(-100);
        raphael.withdraw(50);
        raphael.withdraw(100);
        raphael.withdraw(-50);
        raphael.withdraw(50);
        System.out.println(raphael.getAccountNumber());
        System.out.println(raphael.getCustomerName());
        System.out.println(raphael.getEmail());

        BankAccount rapha = new BankAccount("Tim","email","12345");
        System.out.println(rapha.getAccountNumber());
        System.out.println(rapha.getCustomerName());

        VipCustomers elaine = new VipCustomers();
        System.out.println("-------VIP CUSTOMER-------");
        System.out.println(elaine.getName());
        System.out.println(elaine.getCreditLimit());

        VipCustomers person2 = new VipCustomers("Elaine",10000);
        System.out.println(person2.getName());
        System.out.println(person2.getEmail());

    }
}
