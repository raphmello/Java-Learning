package com.company;
class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car --> startEngine()";
    }

    public String accelerate(){
        return "Car --> accelerate()";
    }

    public String brake() {
        return "Car --> brake()";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

}

class Car1 extends Car {
    public Car1(int cylinders) {
        super("Car1", cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " --> startEngine()";
    }
}

class Car2 extends Car {
    public Car2(int cylinders) {
        super("Car2", cylinders);
    }

    @Override
    public String startEngine() {
        return "Car2 --> startEngine()";
    }
}

class Car3 extends Car {
    public Car3(int cylinders) {
        super("Car3", cylinders);
    }

    @Override
    public String startEngine() {
        return "Car3 --> startEngine()";
    }
}

public class Main {

    public static void main(String[] args) {
        Car carro = new Car1(4);
        System.out.println(carro.startEngine());
        carro = new Car2(6);
        System.out.println(carro.startEngine());

        carro = new Car3(6);
        System.out.println(carro.startEngine());
    }



}
