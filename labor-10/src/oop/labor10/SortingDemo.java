package oop.labor10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class SortingDemo {
    ArrayList<String> fruits = new ArrayList<>();



    public SortingDemo(String filename) {
        try(Scanner scanner = new Scanner(new File(filename)))
        {
            while (scanner.hasNextLine())
            {
                fruits.add(scanner.nextLine());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void printFruits()
    {
        for (String i : fruits)
            System.out.print(i + ", ");
    }

    public void sortAlphabetically()
    {
        Collections.sort(fruits);
    }
    public void sortReverseAlphabetically()
    {
        Collections.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -Integer.compare(o1.length(), o2.length());
            }
        });
    }
}
