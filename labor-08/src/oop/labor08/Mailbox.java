package oop.labor08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.io.FileNotFoundException;
public class Mailbox {
    ArrayList<Contact> contacts;
    ArrayList<Mail> mails;

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public ArrayList<Mail> getMails() {
        return mails;
    }

    public Mailbox(String fileName) {
        contacts = new ArrayList<>();
        mails = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    break;
                }
                String[] items = line.split(",");
                int id = Integer.parseInt(items[0].trim());
                String firstName = items[1].trim();
                String lastName = items[2].trim();
                long birthDate = Long.parseLong(items[3].trim());
                String address = items[4].trim();
                String phoneNr = items[5].trim();
                String eMail = items[6].trim();
                String webPage = items[7].trim();
                Contact contact = new Contact(id, firstName, lastName, birthDate, address, phoneNr, eMail, webPage);
                contacts.add(contact);
            }
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(";");
                int from = Integer.parseInt(items[0].trim());
                int to = Integer.parseInt(items[1].trim());
                long time = Long.parseLong(items[2].trim());
                String subject = items[3].trim();
                String message = items[4].trim();
                Mail mail = new Mail(from, to, time, subject, message);
                mails.add(mail);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void print()
    {
        if(mails.isEmpty())
        {
            System.out.println("empty");
        }
        else
            for (Mail mail : mails)
            {
                System.out.println(mail);
            }
    }

    public void send(Mail mail)
    {
        mails.add(mail);
    }

    public void delete(Mail mail)
    {
        mails.remove(mail);
    }

    public int contactCount()
    {
        return contacts.size();
    }

    public int mailCount()
    {
        return mails.size();
    }

    public int messageLenght()
    {
        int sum=0;
        for (Mail mail : mails)
        {
            sum += mail.getMessage().length();
        }
        return sum;
    }

    public ArrayList<Contact> findContacts(String name)
    {
        ArrayList<Contact> newContacts = new ArrayList<>();
        for (Contact contact : contacts)
        {
            if(contact.getFirstName().contains(name) || contact.getLastName().contains(name) || contact.getEmail().contains(name) )
                newContacts.add(contact);
        }
        return newContacts;
    }

    public ArrayList<Mail> findMails(String term)
    {
        ArrayList<Mail> newMails = new ArrayList<>();
        for (Mail mail : mails)
        {
            if(mail.getSubject().contains(term) || mail.getMessage().contains(term))
                newMails.add(mail);
        }
        return newMails;
    }

    public ArrayList<Mail> recievedMails(int fromUserId) {
        ArrayList<Mail> newMails = new ArrayList<>();
        for (Mail mail : mails)
        {
            if(mail.getFrom() == fromUserId)
                newMails.add(mail);
        }
        return newMails;
    }

    public ArrayList<Mail> recievedMails2() {
        ArrayList<Mail> newMails = new ArrayList<>();
        for (Mail mail : mails)
        {
            if(mail.getTo() == 0)
                newMails.add(mail);
        }
        return newMails;
    }

    public Mail latestReceivedMail(){
        return recievedMails2().getLast();
    }

    public void deleteAllFrom(int fromUserId)
    {
        Iterator<Mail> iterator = mails.iterator();
        while (iterator.hasNext()) {
            Mail mail = iterator.next();
            if (mail.getFrom() == fromUserId) {
                iterator.remove();
            }
        }
    }

    public ArrayList<Mail> sentMails(long timeAfterSent)
    {
        ArrayList<Mail> newMails = new ArrayList<>();
        for (Mail mail : mails)
        {
            if(mail.getTime() > timeAfterSent)
                newMails.add(mail);
        }
        return newMails;
    }
}
