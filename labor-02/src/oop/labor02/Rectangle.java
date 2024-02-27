package oop.labor02;

public class Rectangle {
    private double lenght;
    private double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    public double area()
    {
        return lenght*width;
    }

    public double perimeter()
    {
        return lenght*2 + width*2;
    }

}
