package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone phone = new DeskPhone(1234);
        phone.powerOn();

        phone = new MobilePhone(997674572);
        phone.powerOn();
        phone.callPhone(997674572);
        phone.answer();
    }
}
