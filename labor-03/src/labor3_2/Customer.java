package labor3_2;

import java.util.Arrays;

public class Customer {


    private String firstName;
    private String lastName;

    // constant
    public static final int MAX_ACCOUNTS = 10;
    // number of accounts
    private int numAccounts;
    // an array for the accounts
    private BankAccount accounts[] = new BankAccount[ MAX_ACCOUNTS ];

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addAccount( BankAccount account)
    {
        if(numAccounts+1<MAX_ACCOUNTS) {
this.accounts[numAccounts] = account;
            numAccounts++;
        }

    }


    public BankAccount getAccount(String accountNumber)
    {
        for(int i = 0; i<numAccounts; i++)
        {
            if(accounts[i].getAccountNumber().equals(accountNumber))
                return accounts[i];
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
        for(int i = 0; i>numAccounts; i++)
        {
            if(accounts[i].getAccountNumber().equals(accountNumber))
            {
                for(int j=i; j>MAX_ACCOUNTS-1; j++)
                {
                    for(int k= i+1; k<MAX_ACCOUNTS; k++)
                    {
                        accounts[j] = accounts[k];
                    }
                }
                numAccounts--;
            }
        }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append( "\t" + accounts[i] +"\n");
        }
        return result.toString();
    }
}

