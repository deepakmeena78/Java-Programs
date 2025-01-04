
/*
 * 2. Shape Area Calculator
Objective: Calculate the area of different shapes using a common interface.

Define an interface Shape with a method calculateArea().
Create classes Circle and Rectangle that implement the Shape interface.
Input dimensions and calculate the area of each shape.

 */
import java.util.Scanner;

interface Shape {
    void calculateArea();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println("Circle : " + (radius * radius) * 3.14);
    }
}

class Rectangle implements Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        System.out.println("Rectangle Area : " + length * breadth);
    }
}

public class AS_ShapeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius");
        double d = sc.nextDouble();

        System.out.println("Enter length : ");
        double l = sc.nextDouble();

        System.out.println("Enter Breadth : ");
        double b = sc.nextDouble();

        Shape c = new Circle(d);
        c.calculateArea();
        Shape r = new Rectangle(l, b);
        r.calculateArea();

    }
}
