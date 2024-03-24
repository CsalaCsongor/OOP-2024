package oop.labor05;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Training {
    Course course;
    ArrayList<Student> enrolledStudents;
    MyDate startDate;
    MyDate endDate;
    double pricePerStudent;

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }
    public boolean enroll(Student student)
    {
        if(enrolledStudents.contains(student))
            return true;
        enrolledStudents.add(student);
        return false;
    }

    public void printToFile() {
        String fileName = String.format("%s_%s_%s.csv", course.getName(), startDate.toString(), endDate.toString());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Writing header
            writer.write("Student Name, Student ID\n");

            // Writing enrolled students
            for (Student student : enrolledStudents) {
                writer.write(String.format("%s, %s\n", student.getFirstName(), student.getID()));
            }

        } catch (IOException e) {
            System.out.println("Error occurred while writing to file: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Training{\n");
        sb.append("course='").append(course).append("'\n");
        sb.append("startDate=").append(startDate).append("\n");
        sb.append("endDate=").append(endDate).append("\n");
        for (Student student : enrolledStudents) {
            sb.append(student).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
