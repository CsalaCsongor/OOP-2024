package oop.labor06;

import java.util.Arrays;

public class MyStack {
    private int capacity;
    private int top;
    private double[] element;

    public MyStack(int capacity) {
        this.capacity = capacity;
        this.top = 0;
        this.element = new double[capacity];
    }

    public void push(double value)
    {
        if (this.top < this.capacity) {
            this.element[this.top] = value;
            this.top++;
        } else {
            System.out.println("A verem tele van." + value);
        }
    }
    public double pop()
    {
        this.top--;
        double removed = element[top];
        element[top] = 0;
        return removed;

    }

    @Override
    public String toString() {
        return "MyStack{" +
                "capacity=" + capacity +
                ", top=" + top +
                ", element=" + Arrays.toString(element) +
                '}';
    }
}
