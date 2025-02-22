import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
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

    public int compareTo(Employee o) {
        if (this.getId() < o.getId()) {
            return +1;
        } else if (this.getId() > o.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class ComprableCode4 {
    public static void main(String[] args) {
        TreeSet<Employee> s = new TreeSet<Employee>();

        Employee e1 = new Employee(101, "meena", 200000);
        Employee e2 = new Employee(102, "ajeet", 204000);
        Employee e3 = new Employee(103, "karan", 203000);
        Employee e4 = new Employee(104, "mohan", 240000);

        s.add(e1);
        s.add(e2);
        s.add(e3);


        s.add(e4);

        System.out.println(s);
    }
}
