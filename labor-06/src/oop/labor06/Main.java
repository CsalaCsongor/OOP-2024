package oop.labor06;

public class Main {
    public static void main(String[] args) {

       MyStack myStack = new MyStack(5);
       myStack.push(3);
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
    }
}
