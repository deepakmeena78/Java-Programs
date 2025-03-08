import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Stu {
    int id;
    String name;
    int marks;

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

public class ConsumerInterFace {
    public static void main(String[] args) {
        Stu[] arr = {
                new Stu(101, "meena", 88),
                new Stu(102, "ankit", 98),
                new Stu(103, "ajeet", 95),
                new Stu(104, "goutam", 78),
                new Stu(105, "vipin", 87)
        };

        Function<Stu, String> f = n -> {
            int ms = n.getMarks();
            if (ms > 80)
                return "A";
            else if (ms > 60)
                return "B";
            else if (ms > 50)
                return "C";
            else
                return "D";
        };

        Consumer<Stu> c = n -> {
            System.out.println("ID: " + n.getId());
            System.out.println("Name: " + (n.getName().contains("v") ? n.getName().toUpperCase() : n.getName()));
            System.out.println("Marks: " + n.getMarks());
            System.out.println("Grade: " + f.apply(n));
            System.out.println("----------------------");
        };

        Predicate<Integer> p = w -> w > 50;

        for (Stu ar : arr) {
            if (p.test(ar.getMarks())) {
                c.accept(ar);
            }
        }
    }
}
