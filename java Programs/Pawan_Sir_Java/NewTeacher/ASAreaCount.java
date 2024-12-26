import java.util.Scanner;
/*Assignment 1: 
Shape Area Calculation
Create a parent class Shape with a method calculateArea() that prints "Area calculation not defined for Shape."
Create subclasses:
Circle that overrides calculateArea() to calculate and print the area of a circle.
Rectangle that overrides calculateArea() to calculate and print the area of a rectangle.
Write a Main class to demonstrate polymorphism using an array of Shape objects.
 */

class Shape {
    public void calculateArea() {
        System.out.println("Area calculation not defined for Shape.");
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double sum = (radius * radius) * 3.14;
        System.out.println("Radius : " + sum);
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    public void calculateArea() {
        double temp = length * breadth;
        System.out.println("Area : " + temp);
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

public class ASAreaCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius Value : ");
        double rad = sc.nextDouble();

        System.out.println("Enter length : ");
        double len = sc.nextDouble();

        System.out.println("Enter Breadth : ");
        double bre = sc.nextDouble();

        Circle c = new Circle(rad);
        c.calculateArea();

        Rectangle r = new Rectangle(len, bre);
        r.calculateArea();
    }
}
