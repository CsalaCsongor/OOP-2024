package lab7_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Bank OTP = new Bank("OTP");


        OTP.addCustomer(new Customer("Almas", "Pite"));
        OTP.addCustomer(new Customer("Laczko", "Malacko"));

        for (int i=0; i<OTP.numCustomers(); i++)
        {
            Customer c = OTP.getCustomer(i+1);
            c.addAccount(new SavingsAccount(0.15));
            c.addAccount(new CheckingAccount(5));

        }

        for (int i=0; i<OTP.numCustomers(); i++)
        {
            Customer c = OTP.getCustomer(i+1);
            for (String accountNr : c.getAccountNumbers())
            {
                BankAccount a = c.getAccount(accountNr);
                a.deposit(200);
            }
        }

        System.out.println(OTP);

        for (int i=0; i<OTP.numCustomers(); i++)
        {
            Customer c = OTP.getCustomer(i+1);
            for (String accountNr : c.getAccountNumbers())
            {
                BankAccount a = c.getAccount(accountNr);

                if(a instanceof SavingsAccount)
                {
                    ((SavingsAccount) a).addInterest();
                }

            }
        }
        System.out.println(OTP);


        //OTP.getCustomer(1).getAccount("OTP0000000").deposit(1000);

    }




}
