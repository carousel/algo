package com.miro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {

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

    @Test
    void clear() {
        Car[] cars = {Car.create("WW"), Car.create("Audi"), Car.create("BMW"), Car.create("Toyota")};
        int size = cars.length;
        Array<Car> carsArray = new Array(size, cars);
        assertEquals(carsArray.size(), 4);
        carsArray.clear();
        assertEquals(carsArray.size(), 0);
    }

    @Test
    void contains() {
        Car ww = Car.create("WW");
        Car audi = Car.create("Audi");
        Car[] cars = {ww};
        int size = cars.length;
        Array<Car> carsArray = new Array(size, cars);
        assertTrue(carsArray.contains(ww));
        assertFalse(carsArray.contains(audi));
    }

    @Test
    void linearSearch() {
        Car[] cars = {Car.create("WW"), Car.create("Audi"), Car.create("BMW"), Car.create("Toyota")};
        Car Honda = Car.create("Honda");
        Car WW = cars[0];
        int size = cars.length;
        Array<Car> carsArray = new Array(size, cars);
        assertEquals(WW, carsArray.linearSearch(cars[0]));
        assertNull(carsArray.linearSearch(Honda));
    }
}