package org.example.services;

public class Initialize {
    int arr[];
    int front;
    int tail;
    int capacity;

    public void initialize(int size) {
        capacity = size;
        front = 0;
        tail = -1;
        arr = new int[size];
    }
}
