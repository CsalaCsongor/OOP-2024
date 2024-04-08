package lab7_1;

public class CheckingAccount extends BankAccount {

    private double overDarftLimit;

    public CheckingAccount(double overDarftLimit) {
        this.overDarftLimit = overDarftLimit;
    }

    public double getOverDarftLimit() {
        return overDarftLimit;
    }

    public void setOverDarftLimit(double overDarftLimit) {
        this.overDarftLimit = overDarftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance + overDarftLimit < amount ) {
            return false;
        }
        balance-=amount;
        return true;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "overDarftLimit=" + overDarftLimit +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

}
