/*
 * Online Learning Platform:
You are tasked with modeling a course management system.

Abstract Class:

Create an abstract class Course with the following:
Fields:
String courseName
int duration (in weeks)
Constructor to initialize fields.
Abstract method showContent().
Concrete method displayDetails() to print the course name and duration.
Subclasses:

Create the following subclasses:
ProgrammingCourse:
Additional field: String language.
Override showContent() to print "This course covers programming in [language]."
DesignCourse:
Additional field: String tool.
Override showContent() to print "This course focuses on design using [tool]."
Main Class:

Create objects of ProgrammingCourse and DesignCourse.
Call showContent() and displayDetails() for each course.



 */



abstract class Course {
    String courseName;
    int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    abstract public void showContent();

    public void displayDetails() {
        System.out.println("Course Name : " + courseName + "\nDuration : " + duration);
    }
}

class ProgrammingCourse extends Course {
    String language;

    public ProgrammingCourse(String courseName, int duration, String language) {
        super(courseName, duration);
        this.language = language;
    }

    public void showContent() {
        System.out.println("This course covers programming in : " + language);
    }
}

class DesignCourse extends Course {
    String tool;

    public DesignCourse(String courseName, int duration, String tool) {
        super(courseName, duration);
        this.tool = tool;
    }

    public void showContent() {
        System.out.println("This course focuses on design using : " + tool);
    }
}

public class ASCourse {
    public static void main(String[] args) {
        Course p = new ProgrammingCourse("OOPS", 6, "java");
        p.displayDetails();
        p.showContent();

        Course d = new DesignCourse("Exception", 2, "VS Code");
        d.displayDetails();
        d.showContent();
    }
}