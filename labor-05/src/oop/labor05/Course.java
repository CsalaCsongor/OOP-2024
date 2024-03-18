package oop.labor05;

public class Course {
    private String name;
    private String descripiton;
    private int numHours;

    public Course(String name, String descripiton, int numHours) {
        this.name = name;
        this.descripiton = descripiton;
        this.numHours = numHours;
    }

    public String getName() {
        return name;
    }

    public String getDescripiton() {
        return descripiton;
    }

    public int getNumHours() {
        return numHours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", descripiton='" + descripiton + '\'' +
                ", numHours=" + numHours +
                '}';
    }
}
