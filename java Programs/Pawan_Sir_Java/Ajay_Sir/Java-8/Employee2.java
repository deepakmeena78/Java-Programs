import java.util.ArrayList;
import java.util.function.Predicate;

class Data {
    int id;
    String name;

    public Data(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    double salary;
}

public class Employee2 {
    public static void main(String[] args) {

        Data d1 = new Data(101, "Meena", 5000);
        Data d2 = new Data(102, "ankit", 4000);
        Data d3 = new Data(103, "jayesh", 35000);
        Data d4 = new Data(104, "goutam", 55000);
        Data d5 = new Data(105, "ajeet", 56000);

        ArrayList<Data> ar = new ArrayList();
        ar.add(d1);
        ar.add(d2);
        ar.add(d3);
        ar.add(d4);
        ar.add(d5);

        Predicate<Data> p = value -> value.getName().startsWith("a");

        for (Data x : ar) {
            if (p.test(x)) {
                System.out.println(x.getName());
            }
        }
    }
}
