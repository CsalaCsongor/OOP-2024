package lab4_2;

public class BankAccount {
    private String accountNumber;
    private double balance;



    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
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
                '}';
    }
}
