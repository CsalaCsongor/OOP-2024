package oop.labor02;
<<<<<<< HEAD

public class Main {
    public static void main(String[] args) {
        System.out.println("labor02");
=======
import java.util.Random;

public class Main {




    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("OTP00001");
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());
        account1.deposit(1000);
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());

        BankAccount account2 = new BankAccount("OTP00002");
        System.out.println(account2.getAccountNumber() + ": " + account2.getBalance());
        account2.deposit(2000);
        System.out.println(account2.getAccountNumber() + ": " + account2.getBalance());

        Rectangle rectangle1 = new Rectangle(3,2);
        System.out.println(rectangle1.area() + " - " + rectangle1.perimeter());


        Rectangle[] rectangles = new Rectangle[ 10 ];
        // use a random generator
        Random rand = new Random();
//generate positive random numbers less than a bound

        for (int i=0; i<10; i++) {
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10) ;
            rectangles[i] = new Rectangle(length, width);
            System.out.println(rectangles[i].area() + " - " + rectangles[i].perimeter());

        }


>>>>>>> 77273a5 (Initial commit)
    }
}
