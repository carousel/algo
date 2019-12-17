package com.miro;

public interface DynamicArrayInterface<T> {
    public boolean isEmpty();

    public Integer size();

    public T get(int index);

    public void update(int index, T elem);

    public void merge(T[] input);

    public void append(T o);

    public void prepend(T o);

    public void clear();

    public boolean contains(T o);

}
