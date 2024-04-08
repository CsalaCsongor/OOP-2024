package lab7_1;

import java.io.PrintStream;
import java.util.ArrayList;

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
        for( Customer customer: customers )
        {
            if(customer.getID() == customerId)
                return customer;
        }
        return null;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bank: ").append(this.name).append("\n");
        for (Customer customer : customers)
        {
            sb.append(customer.getFirstName()).append(" ")
                    .append(customer.getLastName()).append("\n");
            for (String accountNr : customer.getAccountNumbers())
            {
                sb.append("\t").append(customer.getAccount(accountNr)).append(" ")
                        .append("\n");
            }
        }
        return sb.toString();


    }
}
