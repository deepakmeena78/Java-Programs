import java.util.Scanner;
/*
 * Assignment 5:
Create a parent class Employee with a method calculateSalary() that prints "Base salary calculation for Employee."
Create subclasses:
Manager that overrides calculateSalary() to add a bonus to the base salary.
Developer that overrides calculateSalary() to calculate salary based on hours worked.
Demonstrate the overridden method in the Main class by creating an array of Employee objects and calling calculateSalary() on each.
 */

class Employee {
    public void calculateSalary() {
        System.out.println("Base salary calculation for Employee");
    }
}

class Manager extends Employee {
    double hours;
    double bouns;

    public Manager(double bonus, double hours) {
        this.hours = hours;
        this.bouns = bonus;
    }

    public void calculateSalary() {
        double temp = (30 * 1600) + bouns;
        System.out.println("Salary  : " + 30 * 1600);
        System.out.println("Salary  + Bonus : " + temp);
    }
}

class Developer extends Employee {
    double hours;

    public Developer(double hours) {
        this.hours = hours;
    }

    public void calculateSalary() {
        System.out.println("Hours Salary : " + hours * 200);
    }
}

public class ASUserDelails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("200 Per Hour");
        System.out.println("Enter Bonus : ");
        int b = sc.nextInt();

        System.out.println("Enter Your Hours : ");
        int h = sc.nextInt();

        Employee e = new Manager(b, h);
        e.calculateSalary();

        Employee e1 = new Developer(h);
        e1.calculateSalary();
    }
}
