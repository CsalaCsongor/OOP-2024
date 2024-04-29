package oop.labor08;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {


        Mailbox mailbox = new Mailbox("mailbox.txt");

        mailbox.print();
        System.out.println("\n\n");
        System.out.println(mailbox.findContacts("gmail"));
        System.out.println("\n\n");
        System.out.println(mailbox.findMails("Tények Chuck Norrisról"));
        System.out.println("\n\n");
        System.out.println(mailbox.recievedMails(1));
        System.out.println("\n\n");
        ArrayList<Mail> mails = mailbox.sentMails(2023_03_01_00_00L);
        System.out.println(mails);
        mailbox.deleteAllFrom(999);
        System.out.println("\n\n");
        mailbox.print();



    }
}
