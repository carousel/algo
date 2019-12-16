package com.miro;

public class DynamicArray<T> implements DynamicArrayInterface<T> {

    private static final Integer ZERO = 0;
    private T[] data;

    public DynamicArray(int size, T[] input) {
        this.data = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            init(i, input[i]);
        }
    }

    /**
     * this method is adding new elements to existing array by coping from both arrays into new one
     *
     * @param input
     */
    public void append(T[] input) {
        if (size().equals(-1)) {
            this.data = (T[]) new Object[input.length];
        } else {
            int newSize = size() + input.length;
            T[] newArray = (T[]) new Object[newSize];
            for (int i = 0; i < size(); i++) {
                newArray[i] = this.data[i];
            }
            int k = 0;
            while (k < input.length) {
                newArray[size() + k] = input[k];
                k++;
            }

            this.data = newArray;
        }

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
    public T get(int index) throws IndexOutOfBoundsException {
        if (!isEmpty()) {
            return (T) this.data[index];
        } else {
            throw new IndexOutOfBoundsException("Array is empty");
        }
    }

    private void init(int index, T elem) {
        data[index] = elem;
    }

    /**
     * update one element in the array
     *
     * @param index
     * @param elem
     * @throws IndexOutOfBoundsException
     */
    @Override
    public void update(int index, T elem) throws IndexOutOfBoundsException {
        if (index > data.length + 1) {
            throw new IndexOutOfBoundsException("index is greater then size");
        } else {
            data[index] = elem;
        }
    }
}
