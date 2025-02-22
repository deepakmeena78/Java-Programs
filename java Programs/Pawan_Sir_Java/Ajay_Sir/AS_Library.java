
/* 
 *  Library Management System
Objective: Manage library operations using an interface.

Define an interface LibraryOperations with methods issueBook() and returnBook().
Implement the interface in Student and Teacher classes.
Demonstrate how students and teachers interact with the library differently.
 */
import java.util.Scanner;

interface LibraryOperations {
    void issueBook();
    void returnBook();
}

class Student implements LibraryOperations {
    public void issueBook() {
        System.out.println("Student Issue Book");
    }

    public void returnBook() {
        System.out.println("Student Return Book");
    }
}

class Teacher implements LibraryOperations {
    public void issueBook() {
        System.out.println("Teacher Issue Book");
    }

    public void returnBook() {
        System.out.println("Taacher Return Book");
    }
}

public class AS_Library {
    public static void main(String[] args) {

        LibraryOperations s = new Student();
        s.issueBook();
        s.returnBook();

        LibraryOperations t = new Teacher();
        t.issueBook();
        t.returnBook();
    }
}
