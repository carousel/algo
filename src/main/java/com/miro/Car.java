package com.miro;

public class Car {
    private String brand;

    public String getBrand() {
        return brand;
    }

    private Car(String brand) {
        this.brand = brand;
    }

    public static Car create(String brand) {
        return new Car(brand);
    }
}