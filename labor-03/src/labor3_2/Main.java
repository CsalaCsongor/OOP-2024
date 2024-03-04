package labor3_2;

public class Main {
    public static void main(String[] args)

    {
 Customer person1 = new Customer("JHON", "BLACK");
 person1.addAccount(new BankAccount("OTP00001"));
 person1.getAccount("OTP00001").deposit(10000);
 person1.addAccount(new BankAccount("OTP00002"));

 System.out.println(person1);
    }

}
