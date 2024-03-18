package lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Customer> readFromCSVFile(String fileName) {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer currentCustomer = null;

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] items = line.split(",");
                String type = items[0].trim();

                switch (type) {
                    case "Customer":
                        // Create a new customer
                        String firstName = items[1].trim();
                        String lastName = items[2].trim();
                        currentCustomer = new Customer(firstName, lastName);
                        customers.add(currentCustomer);
                        break;
                    case "Account":
                        // Add account to the current customer
                        String accountNumber = items[1].trim();
                        double balance = Double.parseDouble(items[2].trim());
                        currentCustomer.addAccount(new BankAccount(accountNumber));
                        currentCustomer.getAccount(accountNumber).deposit(balance);
                        break;
                    default:
                        // Handle unknown type
                        System.out.println("Unknown type: " + type);
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public static void main(String[] args) {
        // Example usage of readFromCSVFile
        ArrayList<Customer> customers = readFromCSVFile("lab4_2_input.csv");

        // Print information about customers and their accounts
        for (Customer customer : customers) {
            System.out.println(customer);
        }


        MyArray myArray =  new MyArray("data.txt");
        System.out.println(myArray);
    }
}
