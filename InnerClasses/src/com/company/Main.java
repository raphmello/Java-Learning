package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint1 = new Button("Print1");
    private static Button btnPrint2 = new Button("Print2");
    private static Button btnPrint3 = new Button("Print2");



    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//        System.out.println(first.driveSpeed(1000));
//        mcLaren.addGear(1,5.3);
//        mcLaren.addGear(2,10.6);
//        mcLaren.addGear(3,15.9);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));

        class ClickListener implements Button.OnClickListener {

            public ClickListener() {
                System.out.println("Ive been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        btnPrint1.setOnClickListener(new ClickListener());
        btnPrint2.setOnClickListener(new ClickListener());

        btnPrint3.setOnClickListener(new ClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println("Different type");
            }
        });
        btnPrint3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println("Button 3 was clicked");
            }
        });

        listen();

    }

    public static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit=true;
                    break;
                case 1:
                    btnPrint1.onClick();
                    break;
                case 2:
                    btnPrint2.onClick();
                    break;
                case 3:
                    btnPrint3.onClick();

            }
        }
    }
}


