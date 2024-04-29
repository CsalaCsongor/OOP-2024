package oop.labor09;

import java.util.ArrayList;
import java.util.Arrays;

public class CircularQueue implements IQueue {

    int CAPACITY;
    Object[] items;
    int front, rear;


    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        rear = -1;
        front = -1;
        items =  new Object[CAPACITY];
    }

    @Override
    public boolean isEmpty() {
        return ((front == -1) && (rear == -1));
    }

    @Override
    public boolean isFull() {
        return (rear + 1) % CAPACITY == front;
    }

    @Override
    public void enQueue(Object o) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % CAPACITY;
            items[rear] = o;
            System.out.println("Inserted " + o);
        }
    }

    @Override
    public Object deQueue() {
        Object element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            }  else {
                front = (front + 1) % CAPACITY;
            }
            return (element);
        }
    }

    @Override

    public void printQueue() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Front -> " + front);
            System.out.println("Items -> \n");
            for (i = front; i != rear; i = (i + 1) % CAPACITY)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);
            System.out.println("Rear -> " + rear);
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CircularQueue that = (CircularQueue) object;
        if (CAPACITY != that.CAPACITY || front != that.front || rear != that.rear) {
            return false; // Ha a kapacitás vagy a front/rear érték nem egyezik, akkor nem egyenlők
        }
        int size = size(); // A két sor hosszának meghatározása
        for (int i = 0; i < size; i++) {
            if (!items[(front + i) % CAPACITY].equals(that.items[(that.front + i) % that.CAPACITY])) {
                return false; // Ha az elemek nem egyeznek, akkor nem egyenlők
            }
        }
        return true; // Ha minden elem egyezik, akkor a két sor egyenlő
    }

    private int size() {
        if (isEmpty()) {
            return 0; // Ha a sor üres, a mérete 0
        }
        if (front <= rear) {
            return rear - front + 1; // Ha a front és a rear közötti elemek közvetlenül követik egymást
        } else {
            return CAPACITY - front + rear + 1; // Ha a front és a rear körkörösen helyezkedik el
        }
    }


}
