package Practice;
import java.util.ArrayList;
import java.util.Collections;

class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject() {
        color = "white";
        filled = false;
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}

class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        // Implement this method to calculate the area of the triangle
        // You can use Heron's formula or other methods to calculate the area
        // For simplicity, let's just return 0.0 for now
        return 0.0;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }
}

public class TestTriangle {
    public static void main(String[] args) {
        // Prompt the user to enter three sides of the triangle
        // You need to add code here to read user input and create a Triangle object

        // For demonstration purpose, let's assume the user entered the sides as 3.0, 4.0, and 5.0
        double side1 = 3.0;
        double side2 = 4.0;
        double side3 = 5.0;

        // Create a Triangle object
        Triangle triangle = new Triangle(side1, side2, side3);

        // Prompt the user to enter color and filled status
        // You need to add code here to read user input and set the color and filled status of the triangle

        // For demonstration purpose, let's assume the user entered color as "red" and filled status as true
        String color = "red";
        boolean filled = true;

        // Set the color and filled status of the triangle
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Display the properties of the triangle
        System.out.println("Triangle properties:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }
}
