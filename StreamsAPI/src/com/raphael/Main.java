package com.raphael;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList("N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50","g64",
                "I26", "I17", "I29",
                "O71");

        //CONVENTIONAL
        List<String> gNumbers = new ArrayList<>();
        someBingoNumbers.forEach(number -> {
            if (number.toUpperCase().startsWith("G")) {
                gNumbers.add(number);
            }
        });
        gNumbers.sort(String::compareTo);
        gNumbers.forEach(System.out::println);

        //USING STREAMS
        someBingoNumbers.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

        Stream<String> numberStream1 = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> numberStream2 = Stream.of("N40", "N36", "I26", "I17","I29","O71");
        Stream<String> concatStream = Stream.concat(numberStream1, numberStream2);
        System.out.println("===============================================");
        System.out.println(concatStream.distinct().peek(System.out::println).count());


        Employee john = new Employee("John Doe", 30);
        Employee jane = new Employee("Jane Deer", 25);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        Department hr = new Department("Human Resources");
        hr.addEmployee(jane);
        hr.addEmployee(jack);
        hr.addEmployee(snow);
        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);
        System.out.println("--------------------------------------------");
        departments.stream()
                .map(Department::getEmployees)
                .forEach(System.out::println);

        System.out.println("--------------------------------------------");
        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

        System.out.println("--------------------------------------------");
        List<String> sortedGNumbers = someBingoNumbers.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("--------------------------------------------");
        List<String> sortedGNumbers2 = someBingoNumbers.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .peek(System.out::println)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println("--------------------------------------------");
        Map<Integer, List<Employee>> employeeGroupedByAge = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(Employee::getAge));
        employeeGroupedByAge.forEach((integer, employees) -> {
            System.out.println("Age: " + integer);
            System.out.println(employees);
        });

        System.out.println("--------------------------------------------");
        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((employee1, employee2) -> employee1.getAge() < employee2.getAge() ? employee1 : employee2)
                .ifPresent(System.out::println);

        System.out.println("--------------------------------------------");
        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .min(Comparator.comparing(Employee::getAge))
                .ifPresent(System.out::println);

        System.out.println("--------------------------------------------");
        Stream.of("ABC","AC","BAA","CCCC","XY","ST")
                .filter(s -> {
                    System.out.println(s);
                    return s.length() > 3;
                })
                .count();
    }
}
