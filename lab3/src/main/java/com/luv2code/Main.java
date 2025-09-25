package com.luv2code;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car("Toyota", "Camry", 2018, 2.5, 40000),
                new Car("BMW", "X5", 2020, 3.0, 30000),
                new Car("Audi", "A6", 2019, 2.0, 35000),
                new Car("Mercedes", "C-Class", 2017, 2.2, 50000),
                new Car("Hyundai", "Tucson", 2020, 2.0, 15000)
        };

        System.out.println("Original array:");
        Arrays.stream(cars).forEach(System.out::println);

        Arrays.sort(cars, Comparator
                .comparingInt(Car::getYear)
                .thenComparing(Comparator.comparingInt(Car::getMileage).reversed())
        );

        System.out.println("\nSorted array (year up, mileage down):");
        Arrays.stream(cars).forEach(System.out::println);

        Car target = new Car("BMW", "X5", 2020, 3.0, 30000);
        int index = -1;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(target)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("\nFound target car at index " + index + ":");
            System.out.println(cars[index]);
        } else {
            System.out.println("\nTarget car not found in array.");
        }
    }
}