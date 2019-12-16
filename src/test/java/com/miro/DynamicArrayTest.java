package com.miro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {

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
    void append() {
        Car[] cars = {Car.create("WW")};
        int size = cars.length;
        DynamicArray<Car> carsArray = new DynamicArray(size, cars);
        Car[] newCars = {Car.create("Suzuki"), Car.create("Volvo")};
        carsArray.append(newCars);
        assertFalse(carsArray.isEmpty());
        assertEquals("Volvo", carsArray.get(2).getBrand());

    }

    @Test
    void size() {
        Car[] cars = {Car.create("WW")};
        int size = cars.length;
        DynamicArray<Car> carsArray = new DynamicArray(size, cars);
        Car[] newCars = {Car.create("Suzuki"), Car.create("Volvo")};
        carsArray.append(newCars);
        assertEquals(3, carsArray.size());
    }

    @Test
    void get() {
        Car[] cars = {Car.create("WW")};
        int size = cars.length;
        DynamicArray<Car> carsArray = new DynamicArray(size, cars);
        assertEquals(1, carsArray.size());
        Car[] newCars = {Car.create("Suzuki"), Car.create("Volvo")};
        carsArray.append(newCars);
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
        carsArray.append(newCars);
        Car car = Car.create("Jaguar");
        carsArray.update(1, car);
        assertEquals(3, carsArray.size());
        assertEquals("Jaguar", carsArray.get(1).getBrand());
    }
}