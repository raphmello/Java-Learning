package com.raphael;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim", 21);
        Employee jack = new Employee("Jack", 40);
        Employee snow = new Employee("Snow", 22);
        Employee red = new Employee("Red", 32);
        Employee charming = new Employee("Charming", 52);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

        printEmployeesByAge(employees, "Maior que 30", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees, "\nMenor ou igual 30", employee -> employee.getAge() <= 30);

        IntPredicate greaterThan15 = i -> i > 15;
        IntPredicate lessThan100 = i -> i < 100;
        System.out.println(greaterThan15.test(10));

        System.out.println(greaterThan15.and(lessThan100).test(50));
        System.out.println(greaterThan15.and(lessThan100).test(15));

        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
        for (int i = 0; i < 10; i++) {
            System.out.println(randomSupplier.get());
        }

    }

    public static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
        System.out.println(ageText);
        System.out.println("=====================");
        for (Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
    }
}
