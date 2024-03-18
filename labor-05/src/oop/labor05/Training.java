package oop.labor05;

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
}
