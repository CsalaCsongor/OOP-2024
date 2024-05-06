package oop.labor10;

public class Main {
    public static void main(String[] args)  {

  SortingDemo demo = new SortingDemo("fruit.txt");

  demo.printFruits();

  demo.sortReverseAlphabetically();
        System.out.println("\n");
  demo.printFruits();

        demo.sortAlphabetically();
        System.out.println("\n");
        demo.printFruits();
    }
}
