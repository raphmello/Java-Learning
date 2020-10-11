package com.company;

import javax.swing.plaf.IconUIResource;

public class Main {

    public static void main(String[] args) {
      int count = 1;
      while (count !=6) {
          System.out.println(count);
          count++;
      }

      for (int i = 1; i <7; i++) {
          System.out.println(i);
      }

      for (count = 1; count < 6; count++) {
          System.out.println(count);
      }

      count = 1;
      while (true) {
          if (count == 6) {
              break;
          }
          System.out.println(count);
          count++;
      }
      count = 6;
      do {
          System.out.println(count);
          count++;
          if (count > 100) {
              break;
          }
      } while (count!=6);

    }




}
