package lab7_1;
import java.util.ArrayList;

public class Customer {


    private String firstName;
    private String lastName;


    private ArrayList<BankAccount> accounts = new ArrayList<>();

    private final int ID;
    private static int IDcounter = 1;


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = IDcounter++;
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

    public int getID(){return ID;}

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount(String accountNumber)
    {
        accounts.remove(getAccount(accountNumber));
    }

public ArrayList<String> getAccountNumbers()
{
    ArrayList<String> lista = new ArrayList<String>();
    for(BankAccount i : accounts)
    {
        lista.add(i.getAccountNumber());
    }
    return lista;
}

public int getNumAccounts()
{
    return accounts.size();
}

    @Override
    public String toString() {
        StringBuilder Sb = new StringBuilder();
        Sb.append(firstName).append(" ").append(lastName).append(" ID:").append(ID).append(" Accounts: \n");
        for(BankAccount account : accounts)
        {
            Sb.append("\t").append(account);
        }
        return Sb.toString();
    }
}

