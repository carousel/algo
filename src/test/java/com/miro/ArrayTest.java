package com.miro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void isEmpty() {
        Car[] cars = {};
        int size = cars.length;
        Array<Car> carsArray = new Array(size, cars);
        assertTrue(carsArray.isEmpty());
    }

    @Test
    void get() {
        Car[] cars = {Car.create("WW"), Car.create("Audi"), Car.create("BMW"), Car.create("Toyota")};
        int size = cars.length;
        Array<Car> carsArray = new Array(size, cars);
        assertEquals("WW", carsArray.get(0).getBrand());
    }

    @Test
    void update() {
        //array of objects
        Car[] cars = {Car.create("WW"), Car.create("Audi"), Car.create("BMW"), Car.create("Toyota")};
        int size = cars.length;
        Array<Car> carsArray = new Array(size, cars);
        Car ford = Car.create("Ford");
        carsArray.update(1, ford);
        assertEquals("Ford", carsArray.get(1).getBrand());
    }
}