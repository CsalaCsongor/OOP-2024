package lab4_2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class MyArray {
    private final int lenght;
    private double[] elements;

    public MyArray(int lenght)
    {
        this.lenght = lenght;
        elements = new double[lenght];
    }

    public MyArray(MyArray copy)
    {
        this.lenght = copy.lenght;
        this.elements = new double[this.lenght];
        for (int i=0; i<lenght; i++)
        {
            this.elements[i] = copy.elements[i];
        }
    }

    public MyArray(double[] copy)
    {
        this.lenght = copy.length;
        this.elements = new double[this.lenght];
        for (int i=0; i<lenght; i++)
        {
            this.elements[i] = copy[i];
        }
    }

    public MyArray(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {

            this.lenght = scanner.nextInt();
            this.elements = new double[this.lenght];
            for (int i = 0; i < this.lenght; i++) {
                this.elements[i] = scanner.nextDouble();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "lenght=" + lenght +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
