package oop.labor06.lab6_1;

import java.util.ArrayList;
import java.io.PrintStream;

public class Bank {
    private String name;
    ArrayList<Customer> customers = new ArrayList<Customer>();

    public Bank(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }
    public int numCustomers()
    {
        return customers.size();
    }

    public Customer getCustomer( int customerId )
    {
        return customers.get(customerId);
    }

    private void printCustomers( PrintStream ps ) {
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for( Customer customer: customers ) {
            ps.println( customer.getID()+", " + customer.getFirstName() + ", "+
                    customer.getLastName()+", "+customer.getNumAccounts());
        }
        ps.close();
    }

    public void printCustomersToStdout() {
        printCustomers( System.out );
    }
    public void printCustomersToFile( String filename ) {
        try {
            printCustomers(new PrintStream(filename));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
