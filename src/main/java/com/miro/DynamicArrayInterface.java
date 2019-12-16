package com.miro;

public interface DynamicArrayInterface<T> {
    public boolean isEmpty();

    public Integer size();

    public T get(int index);

    public void update(int index, T elem);

    public void append(T[] input);
}
