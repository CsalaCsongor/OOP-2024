package lab7_2;

import java.util.ArrayList;

public class StackAggregation {

    ArrayList<Object> items = new ArrayList<>();
    private final int capacity;

    public StackAggregation(int capacity){
        this.capacity = capacity;
    }

    public boolean isFull()
    {
        return (items.size() >= capacity);
    }

    public boolean isEmpty()
    {
        return (items.isEmpty());
    }

    public void push(Object item)
    {
        if(isFull())
            return;
        items.add(item);
    }

    public void pop()
    {
        if(isEmpty())
            return;
        items.removeLast();

    }

    public Object top()
    {
        if(isEmpty())
            return null;
        return items.getLast();
    }

    public int getSize()
    {
        return items.size();
    }




}
