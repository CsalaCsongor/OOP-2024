package oop.labor05;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
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
        ArrayList<Student> arrayListStudents = new ArrayList<Student>();
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
                    arrayListStudents.add(student);
                }
            }
        }

    catch(FileNotFoundException e)
    {
        throw new RuntimeException(e);
    }
        return arrayListStudents;
}

    private static MyDate generateRandomDate() {
        Random random = new Random();
        int year = 1970 + random.nextInt(53);
        int month = 1 + random.nextInt(12);
        int day = 1 + random.nextInt(31);
        return new MyDate(year, month, day);
    }

    public static void main(String[] args) {

        ArrayList<Course> courses = readCourses("courses.csv");
        for (Course i : courses) {
            System.out.println(i);
        }
        ArrayList<Student> students = readStudents("students.csv");
        for (Student i : students) {
            System.out.println(i);
        }
        ArrayList<Training> trainingArrayList = new ArrayList<Training>(5);
        Course course1 = new Course("JavaSE8", "Java Standard Edition 8", 40);

        Course course2 = new Course("JavaSE17", "Java Standard Edition 17", 40);

        Course course3 = new Course("JavaSpring5", "Java Enterprise Applications", 40);

        Course course4 = new Course("JavaSpringBoot2", "Developing REST Microservices", 20);

        Course course5 = new Course("DPJava", "Desing Patterns in Java", 24);

        Random random = new Random();
        MyDate trainingDatesStart = new MyDate(2023, 03, 21);
        MyDate trainingDatesEnd = new MyDate(2023, 03, 25);
        Training training1 = new Training(course1, trainingDatesStart, trainingDatesEnd, 1000 + random.nextInt(1001));

        Training training2 = new Training(course2, trainingDatesStart, trainingDatesEnd, 1000 + random.nextInt(1001));

        Training training3 = new Training(course3, trainingDatesStart, trainingDatesEnd, 1000 + random.nextInt(1001));

        Training training4 = new Training(course4, trainingDatesStart, trainingDatesEnd, 1000 + random.nextInt(1001));

        Training training5 = new Training(course5, trainingDatesStart, trainingDatesEnd, 1000 + random.nextInt(1001));


    }



}
