package com.EncapsulationExample;

public class mainApp {
    public static void main(String[] args) {
        Car car = new Car("Chevrolet","Camaro",2000);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setYear(4000);
        System.out.println(car.getYear());

    }
}
