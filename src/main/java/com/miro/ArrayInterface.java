package com.miro;

public interface ArrayInterface<T> {
    public boolean isEmpty();

    public Integer size();

    public T get(int index);

    public void update(int index, T elem);

    public void clear();

    public boolean contains(T o);
}
