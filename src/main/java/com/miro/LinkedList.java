package com.miro;

public class LinkedList<T> {
    private Integer size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    public Integer size() {
        return size;
    }

    private class Node<T> {
        T data;
        Node<T> prev, next;

        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    public void clear() {
        Node<T> trav = head;
        while (trav != null) {
            Node<T> next = trav.next;
            trav.prev = trav.next = null;
            trav.data = null;
            trav = next;
        }
        head = tail = trav = null;
        size = 0;
    }

    public void init(T o) {
        Node<T> node = new Node<>(o, null, null);
        head = node;
        size = (++size);
    }
}
