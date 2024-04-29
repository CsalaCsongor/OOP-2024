package oop.labor10;

public class Main {
    public static void main(String[] args) {

       MyQueue queue = new MyQueue(5);

       queue.push(3);

        System.out.println(queue);

        queue.push(1);
        queue.push(2);

        System.out.println(queue);
    }
}
