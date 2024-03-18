package oop.labor05;

public class MyDate {
    int year, month, day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

}
