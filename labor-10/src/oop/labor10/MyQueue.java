package oop.labor10;

import java.util.Arrays;

public class MyQueue {
    private int capacity;
    private double[] items;
    private int rear, front;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        this.items = new double[capacity];
        this.rear = -1;
        this.front = -1;
    }

    public void push(double value) {
        if (rear == -1) {
            rear = 0;
            front = 0;
        }
        if (front < capacity)
            items[rear++] = value;

    }

    public double peek() {

        return items[front];
    }

    public double take() {

        double save = items[front];
        items[front] = 0;
        front++;
        return save;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}
