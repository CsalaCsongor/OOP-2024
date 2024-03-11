package lab4_2;
import java.util.ArrayList;
public class Customer {


    private String firstName;
    private String lastName;

    private ArrayList<BankAccount> accounts = new ArrayList<>();


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addAccount( BankAccount account)
    {
        accounts.add(account);

    }


    public BankAccount getAccount(String accountNumber)
    {
        for(BankAccount account : accounts) {
            if(account.getAccountNumber().equals(accountNumber))
                return account;
        }


        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount(String accountNumber)
    {
        accounts.remove(getAccount(accountNumber));
    }



    @Override
    public String toString() {
        StringBuilder Sb = new StringBuilder();
        Sb.append(firstName).append(" ").append(lastName).append(" Accounts: \n");
        for(BankAccount account : accounts)
        {
            Sb.append("\t").append(account).append("\n");
        }
        return Sb.toString();
    }
}

