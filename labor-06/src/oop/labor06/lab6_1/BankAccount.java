package oop.labor06.lab6_1;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private static int numAccounts = 0;
    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 10;


    public BankAccount() {
        this.accountNumber = createAccountNumber();
        this.balance = 0;
        numAccounts++;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            this.balance = this.balance + amount;
    }

    public boolean withdraw(double amount) {
        if ((this.balance - amount) >= 0) {
            this.balance = this.balance - amount;
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                "}\n";
    }

    private static String createAccountNumber()
    {
        int n = ACCOUNT_NUMBER_LENGTH - PREFIX.length();
        return String.format("%s%0" + n + "d", PREFIX, numAccounts);
    }

}

