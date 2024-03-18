package oop.labor05;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    private static ArrayList<Course> readCourses(String filename) {
        Course course;
        ArrayList<Course> arrayList = new ArrayList<Course>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] items = line.split(",");
                String name, description;
                int num;
                name = items[0].trim();
                description = items[1].trim();
                num = Integer.parseInt(items[2].trim());
                course = new Course(name, description, num);
                arrayList.add(course);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return arrayList;
    }

    private static ArrayList<Student> readStudents(String filename) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        try (Scanner scanner = new Scanner(new File(filename)))
        {
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                if(!line.isEmpty()) {
                    String[] items = line.split(",");
                    String ID, firstName, lastName;
                    ID = items[0].trim();
                    firstName = items[1].trim();
                    lastName = items[2].trim();
                    Student student = new Student(ID, firstName, lastName);
                    arrayList.add(student);
                }
            }
        }

    catch(FileNotFoundException e)
    {
        throw new RuntimeException(e);
    }
        return arrayList;
}



    public static void main(String[] args) {

    ArrayList<Course> courses = readCourses("courses.csv");
    for (Course i : courses)
    {
        System.out.println(i);
    }
    ArrayList<Student> students = readStudents("students.csv");
    for (Student i : students)
    {
        System.out.println(i);
    }
    }



}
