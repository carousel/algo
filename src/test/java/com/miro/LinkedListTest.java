package com.miro;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.hierarchical.Node;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void clear() {
        LinkedList<Car> linkedList = new LinkedList<>();
        linkedList.clear();
        assertEquals(0, linkedList.size());
    }

    @Test
    void init() {
        Car car = Car.create("WW");
        LinkedList<Car> linkedList = new LinkedList<>();
        linkedList.init(car);
        assertEquals(1, linkedList.size());
    }

}