package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Adelaide");

        printList(placesToVisit);

        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList ,String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison==0){
                System.out.println(newCity + " is already included as a destination.");
                return false;
            } else if(comparison >0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //do nothing
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itinerary.");
        } else {
            System.out.println("Now visiting..." + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting..." + listIterator.next());
                    } else {
                        System.out.println("End of list");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting..." + listIterator.previous());
                    } else  {
                        System.out.println("Start of the list");
                        forward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
                default:
                    System.out.println("Select a valid option.");
                    printMenu();
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - Quit\n" +
                "1 - next\n" +
                "2 - previous\n" +
                "3 - print options");
    }
}








