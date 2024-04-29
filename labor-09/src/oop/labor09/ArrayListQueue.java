package oop.labor09;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue  implements IQueue{
    private ArrayList<Object> items = new ArrayList<Object>();
    int CAPACITY;


    public ArrayListQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }


    @Override
    public boolean isEmpty() {
       return items.size() == 0;
    }

    @Override
    public boolean isFull() {
        return this.CAPACITY == items.size();
    }

    @Override
    public void enQueue(Object object) {

        if(isFull())
        {
            System.out.println("Queue is full.\n");

        }
        else
            items.addFirst(object);

    }


    @Override
    public Object deQueue() {
        Object save = items.getLast();
        items.removeLast();
        return save;

    }

    @Override
    public void printQueue() {

        for(Object i : items)
            System.out.println(i );
    }


}
