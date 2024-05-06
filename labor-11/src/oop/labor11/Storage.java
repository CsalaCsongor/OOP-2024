package oop.labor11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Storage {


public int sum = 0;
   Map<Integer, Product> map = new HashMap<>();

    public Storage(String fileName) {

        try(Scanner sc = new Scanner(new File(fileName)))
        {
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                String items[] = line.split(" ");
                int id;
                String name;
                int amount, price;
                id = Integer.parseInt(items[0]);
                name = items[1];
                amount = Integer.parseInt(items[2]);
                price = Integer.parseInt(items[3]);

                Product product = new Product(id, name, amount, price);
                map.put(product.getIdentifier(), product);
                System.nanoTime();
            }


    }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
}

public void update(String fileName)
{
    long beforeUpdate = System.nanoTime();
    try(Scanner sc = new Scanner(new File(fileName)))
    {
        while(sc.hasNextLine())
        {
            String line = sc.nextLine();
            String items[] = line.split(" ");
            int id;
            int amount;
            id = Integer.parseInt(items[0]);
            amount = Integer.parseInt(items[1]);
if(map.get(id)!=null) {
    map.get(id).setAmount(map.get(id).getAmount()+ amount);
    sum++;

}
        }


    }catch (FileNotFoundException e)
    {
        e.printStackTrace();
    }
    long afterUpdate = System.nanoTime();
    System.out.println("Number of all updated products: " + sum + "\n RunTime: " + (afterUpdate - beforeUpdate)/1000000.0);

}

    @Override
    public String toString() {
        return "Storage:" +
                "map=" + map +
                "\n";
    }
}
