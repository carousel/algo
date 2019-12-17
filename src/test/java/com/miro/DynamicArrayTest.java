package com.miro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DynamicArrayTest {

    @Test
    void isEmpty() {
        Car[] cars = {};
        int size = cars.length;
        DynamicArray<Car> carsArray = new DynamicArray(size, cars);
        assertTrue(carsArray.isEmpty());
    }

    @Test
    void isNotEmpty() {
        Car[] cars = {Car.create("WW")};
        int size = cars.length;
        DynamicArray<Car> carsArray = new DynamicArray(size, cars);
        assertFalse(carsArray.isEmpty());
    }

    @Test
    void merge() {
        Car[] cars = {Car.create("WW")};
        int size = cars.length;
        DynamicArray<Car> carsArray = new DynamicArray(size, cars);
        Car[] newCars = {Car.create("Suzuki"), Car.create("Volvo")};
        carsArray.merge(newCars);
        Car toyota = Car.create("Toyota");
        carsArray.append(toyota);
        assertFalse(carsArray.isEmpty());
        assertEquals("Volvo", carsArray.get(2).getBrand());
        assertEquals(4, carsArray.size());

    }

    @Test
    void append() {
        Car[] cars = {Car.create("WW")};
        int size = cars.length;
        DynamicArray<Car> carsArray = new DynamicArray(size, cars);
        assertEquals(carsArray.size(), 1);
        Car car = Car.create("Toyota");
        carsArray.append(car);
        assertEquals(carsArray.size(), 2);
        assertEquals("WW", carsArray.get(0).getBrand());
    }

    @Test
    void prepend() {
        Car[] cars = {Car.create("WW")};
        int size = cars.length;
        DynamicArray<Car> carsArray = new DynamicArray(size, cars);
        assertEquals(carsArray.size(), 1);
        Car WW = Car.create("Toyota");
        carsArray.prepend(WW);
        assertEquals(carsArray.size(), 2);
        assertEquals("Toyota", carsArray.get(0).getBrand());
    }

    @Test
    void size() {
        Car[] cars = {Car.create("WW")};
        int size = cars.length;
        DynamicArray<Car> carsArray = new DynamicArray(size, cars);
        Car[] newCars = {Car.create("Suzuki"), Car.create("Volvo")};
        carsArray.merge(newCars);
        assertEquals(3, carsArray.size());
    }

    @Test
    void get() {
        Car[] cars = {Car.create("WW")};
        int size = cars.length;
        DynamicArray<Car> carsArray = new DynamicArray(size, cars);
        assertEquals(1, carsArray.size());
        Car[] newCars = {Car.create("Suzuki"), Car.create("Volvo")};
        carsArray.merge(newCars);
        assertFalse(carsArray.isEmpty());
        assertEquals("WW", carsArray.get(0).getBrand());
        assertEquals("Suzuki", carsArray.get(1).getBrand());
        assertEquals("Volvo", carsArray.get(2).getBrand());
        assertEquals(3, carsArray.size());
    }

    @Test
    void update() {
        Car[] cars = {Car.create("WW")};
        int size = cars.length;
        DynamicArray<Car> carsArray = new DynamicArray(size, cars);
        Car[] newCars = {Car.create("Suzuki"), Car.create("Volvo")};
        carsArray.merge(newCars);
        Car car = Car.create("Jaguar");
        carsArray.update(1, car);
        assertEquals(3, carsArray.size());
        assertEquals("Jaguar", carsArray.get(1).getBrand());
    }

    @Test
    void clear() {
        Car[] cars = {Car.create("WW"), Car.create("Audi"), Car.create("BMW")};
        int size = cars.length;
        DynamicArray<Car> carsArray = new DynamicArray<>(size, cars);
        assertEquals(carsArray.size(), 3);
        carsArray.clear();
        assertEquals(carsArray.size(), 0);
    }

    @Test
    void contains() {
        Car ww = Car.create("WW");
        Car audi = Car.create("Audi");
        Car[] cars = {ww};
        int size = cars.length;
        DynamicArray<Car> carsArray = new DynamicArray<>(size, cars);
        assertTrue(carsArray.contains(ww));
        assertFalse(carsArray.contains(audi));
    }

    @Test
    void linearSearch() {
        Car[] cars = {Car.create("WW"), Car.create("Audi"), Car.create("BMW"), Car.create("Toyota")};
        Car Honda = Car.create("Honda");
        Car WW = cars[0];
        int size = cars.length;
        DynamicArray<Car> carsArray = new DynamicArray<>(size, cars);
        assertEquals(WW, carsArray.linearSearch(cars[0]));
        assertNull(carsArray.linearSearch(Honda));
    }
}