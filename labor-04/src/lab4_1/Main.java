package lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void readFilePrintItsLineNumbered(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            int lineNumber = 0;
            while (scanner.hasNextLine()) {
                lineNumber++;
                String line = scanner.nextLine();
                System.out.println(lineNumber + " : " + line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Person> readFromCSVFile(String fileName) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String firstName = items[0].trim();
                String lastName = items[1].trim();
                int birthYear = Integer.parseInt(items[2].trim());

                persons.add(new Person(firstName, lastName, birthYear));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }

    public static void main(String[] args) {
        // Example usage of readFilePrintItsLineNumbered
        readFilePrintItsLineNumbered("lab4_1_input.txt");

        // Example usage of readFromCSVFile
        ArrayList<Person> persons = readFromCSVFile("lab4_1_input.csv");

        // Print information about persons
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
