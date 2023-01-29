package com.raphael;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Printing from runnable");
            System.out.println("Line 2");
            System.out.println("Line 3");
        }).start();

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim", 21);
        Employee jack = new Employee("Jack", 40);
        Employee snow = new Employee("Snow", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                return e1.getName().compareTo(e2.getName());
//            }
//        });

        employees.sort(Comparator.comparing(Employee::getName));

        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

//        String testString = doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        },employees.get(0).getName(),employees.get(1).getName());
//
//        System.out.println(testString);

        UpperConcat upperConcat = (s1, s2) -> {
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };
        String testString = doStringStuff(upperConcat, employees.get(0).getName(), employees.get(1).getName());
        System.out.println(testString);


        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);

    }

    public static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }

}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    String upperAndConcat(String s1, String s2);
}

class AnotherClass {
    public String doSomething() {
        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda class's name is: " + getClass().getSimpleName());
            return s1.toUpperCase() + s2.toUpperCase();
        };
        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "String1", "String2");

//        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
//        return Main.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("The anonymous class's name is: " + getClass().getSimpleName());
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, "String1", "String2");
    }
}
