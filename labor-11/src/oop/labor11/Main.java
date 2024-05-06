package oop.labor11;

public class Main {
    public static void main(String[] args) {


        Storage storage = new Storage("data1000.txt");

        System.out.println(storage);

        storage.update("update1000.txt");

    }
}
