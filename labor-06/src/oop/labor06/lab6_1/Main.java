package oop.labor06.lab6_1;
import java.util.ArrayList;
import oop.labor06.MyStack;

public class Main {
    public static void main(String[] args) {
ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
    for (int i = 0; i < 15; i++)
    {
        bankAccounts.add(new BankAccount());
    }
        System.out.println(bankAccounts);


        Customer customer1 = new Customer("Almas", "Pite");
        Customer customer2 = new Customer("Laczko", "Malacko");
        Customer customer3 = new Customer("Raszta", "Mann");

        customer1.addAccount(bankAccounts.get(0));
        customer1.addAccount(bankAccounts.get(12));
        customer1.addAccount(bankAccounts.get(13));
        customer2.addAccount(bankAccounts.get(1));
        customer3.addAccount(bankAccounts.get(2));

        System.out.println(customer1);

        Bank OTP = new Bank("OTP");
        OTP.addCustomer(new Customer("Mate", "Mihaly"));
        OTP.addCustomer(new Customer("Arpi", "Macska"));

    }




}
