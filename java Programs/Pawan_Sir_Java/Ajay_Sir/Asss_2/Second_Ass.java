/*ArrayList of Objects
Objective: Use an ArrayList to manage custom objects.
Tasks:

Create a Student class with attributes like name, age, and marks.
Add multiple Student objects to an ArrayList.
Display the details of all students. */

import java.util.*;

class Student {
    String name;
    int age;
    double marks;

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }
}

public class Second_Ass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Enter number of students:");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter name, age, and marks");
        for (int i = 0; i < numStudents; i++) {

            String name = scanner.nextLine();
            int age = scanner.nextInt();
            double marks = scanner.nextDouble();
            scanner.nextLine();
            students.add(new Student(name, age, marks));
        }

        System.out.println("Student Details:");
        for (Student student : students) {
            student.display();
        }
    }
}
