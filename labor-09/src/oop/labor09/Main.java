package oop.labor09;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        IQueue queue1 = new CircularQueue( 4 );
        queue1.enQueue(1);
        queue1.enQueue(2);
        queue1.enQueue(3);
        queue1.enQueue(0);
        queue1.printQueue();


        IQueue queue2 = new CircularQueue( 4 );
        queue2.enQueue(2);
        queue2.enQueue(3);
        queue2.enQueue(0);
        queue2.enQueue(1);
        queue2.printQueue();

        if(queue1.equals(queue2))
            System.out.println("The queues are equals.");

            }
}
