package com.miro;

public class DynamicArray<T> implements DynamicArrayInterface<T> {

    private static final Integer ZERO = 0;
    private static final Integer ONE = 1;
    private T[] data;

    public DynamicArray(int size, T[] input) {
        this.data = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            init(i, input[i]);
        }
    }

    private void init(int index, T elem) {
        data[index] = elem;
    }

    /**
     * this method is adding new elements to existing array by coping from both arrays into new one (dynamic array)
     *
     * @param input
     */
    public void merge(T[] input) {

        int newSize = size() + input.length;
        T[] newArray = (T[]) new Object[newSize];
        for (int i = 0; i < size(); i++) {
            newArray[i] = this.data[i];
        }
        for (int j = 0; j < input.length; j++) {
            newArray[size() + j] = input[j];
        }
        this.data = newArray;

    }

    /**
     * add new element to the end of the list/resize array
     *
     * @param o
     */
    @Override
    public void append(T o) {
        int newSize = size() + ONE;
        T[] newArray = (T[]) new Object[newSize];
        for (int i = 0; i < size(); i++) {
            newArray[i] = this.data[i];
        }
        newArray[newSize - ONE] = o;
        this.data = newArray;
    }

    /**
     * add new element at the beginning of the list/resize array
     *
     * @param o
     */
    @Override
    public void prepend(T o) {
        int newSize = size() + ONE;
        T[] newArray = (T[]) new Object[newSize];
        newArray[0] = o;
        for (int i = 1; i < size(); i++) {
            newArray[i] = this.data[i];
        }
        this.data = newArray;
    }

    @Override
    public boolean isEmpty() {
        return size() <= 1 && size().equals(ZERO);
    }

    @Override
    public Integer size() {
        return data != null ? data.length : -1;
    }

    @Override
    public T get(int index) {
        if (!isEmpty()) {
            return this.data[index];
        } else {
            throw new IndexOutOfBoundsException("Array is empty");
        }
    }

    /**
     * update one element in the array, replace existing value
     *
     * @param index
     * @param elem
     * @throws IndexOutOfBoundsException
     */
    @Override
    public void update(int index, T elem) {
        if (index > data.length + 1) {
            throw new IndexOutOfBoundsException("index is greater then size");
        } else {
            data[index] = elem;
        }
    }

    @Override
    public void clear() {
        this.data = (T[]) new Object[0];
    }

    @Override
    public boolean contains(T o) {
        for (T d : data) {
            if (o == d) {
                return true;
            }
        }
        return false;
    }


    /**
     * O(n)
     */
    public T linearSearch(T o) {
        if (!isEmpty()) {
            for (T d : data) {
                if (o == d) {
                    return o;
                }
            }
        }
        return null;
    }
}
