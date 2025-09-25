package com.luv2code;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private final int year;          // first field for sorting
    private final double engineVolume;
    private final int mileage;       // second field for sorting if year equal

    public Car(String brand, String model, int year, double engineVolume, int mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineVolume = engineVolume;
        this.mileage = mileage;
    }

    // Getters
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getEngineVolume() { return engineVolume; }
    public int getMileage() { return mileage; }

    @Override
    public String toString() {
        return String.format("%s %s (%d) - Engine: %.1fL, Mileage: %d km",
                brand, model, year, engineVolume, mileage);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return year == car.year &&
                mileage == car.mileage &&
                Double.compare(car.engineVolume, engineVolume) == 0 &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, engineVolume, mileage);
    }
}
