import java.util.function.Function;

class Stu {
    int id;
    String name;
    int marks;

    // Function to determine grade based on marks
    Function<Stu, String> f = y -> {
        int ms = y.getMarks();
        String grade;
        if (ms > 80) {
            grade = "A";
        } else if (ms > 60) {
            grade = "B";
        } else if (ms > 50) {
            grade = "C";
        } else {
            grade = "D"; // Default grade for marks <= 50
        }
        return grade;
    };

    public Stu(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class StudentExample {
    public static void main(String[] args) {
        Stu[] arr = {
                new Stu(101, "meena", 88),
                new Stu(102, "ankit", 98),
                new Stu(103, "ajeet", 95),
                new Stu(104, "goutam", 78),
                new Stu(105, "vipin", 87)
        };

        for (Stu stu : arr) {
            System.out.println("ID: " + stu.getId());
            System.out.println("Name: " + stu.getName());
            System.out.println("Marks: " + stu.getMarks());
            System.out.println("Grade: " + stu.f.apply(stu));
            System.out.println("----------------------");
        }
    }
}
