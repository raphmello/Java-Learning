package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone("iPhone");

    public static void main(String[] args) {
        menu();

        boolean flag = true;
        int choice = 0;

        while (flag) {
            System.out.print("Enter option number: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    menu();
                    break;
                case 2:
                    printContactsList();
                    break;
                case 3:
                    addNewContact();
                    break;
                case 4:
                    modifyContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    findContact();
                    break;
                case 7:
                    flag = false;
                    break;
            }


        }
    }

    public static void menu() {
        System.out.println("List of options:");
        System.out.println("\t 1 - See the list of options.");
        System.out.println("\t 2 - Print list of contacts.");
        System.out.println("\t 3 - Add new contact.");
        System.out.println("\t 4 - Update existing contact.");
        System.out.println("\t 5 - Remove contact.");
        System.out.println("\t 6 - Find contact.");
        System.out.println("\t 7 - Quit application.");
    }

    public static void printContactsList(){
        phone.printContactsList();
    }

    public static void addNewContact(){
        System.out.print("Type the name of the new contact: ");
        String newName = scanner.nextLine();
        System.out.print("Type the phone number of the new contact: ");
        String newPhoneNumber = scanner.nextLine();
        Contacts newContact = new Contacts(newName,newPhoneNumber);
        phone.addContact(newContact);
    }

    public static void modifyContact(){
        System.out.print("Type the name of the contact you'd like to change: ");
        String currentContactName = scanner.nextLine();

        System.out.print("Type the name of the new contact: ");
        String newName = scanner.nextLine();

        System.out.print("Type the phone number of the new contact: ");
        String newPhoneNumber = scanner.nextLine();

        phone.modifyContact(currentContactName,newName, newPhoneNumber);
    }

    public static void removeContact(){
        System.out.print("Type the name of the contact you'd like to remove: ");
        String name = scanner.nextLine();
        phone.removeContact(name);
    }

    public static void findContact(){
        System.out.print("Type the name of the contact you'd like to search: ");
        String name = scanner.nextLine();
        int index = phone.findContact(new Contacts(name,""));
        if (index>=0) {
            System.out.println("Contact found.");
            System.out.println(phone.getContactsList().get(index).getName() +
                    " was found in your list and its number is " +
                    phone.getContactsList().get(index).getPhoneNumber() +
                    ".");
        } else {
            System.out.println("Contact not found in your list.");
        }
    }

}
