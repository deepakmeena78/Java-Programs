import java.util.*;

class Empo implements Comparable<Empo> {
    int id;
    String name;
    double salary;

    public Empo(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Empo [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    @Override
    public int compareTo(Empo o) {
        if (this.getId() < o.getId()) {
            return +1;
        } else if (this.getId() > o.getId()) {
            return -1;
        } else
            return 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

}

class SalarySort implements Comparator<Empo> {

    public int compare(Empo o1, Empo o2) {
        if (o1.getSalary() < o2.getSalary()) {
            return +1;
        } else if (o1.getSalary() > o2.getSalary()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class NameSort implements Comparator<Empo> {

    @Override
    public int compare(Empo o1, Empo o2) {
        return -o1.getName().compareTo(o2.getName());
    }
}

public class Employee {
    public static void main(String[] args) {

        TreeSet<Empo> s = new TreeSet<Empo>(new NameSort());
        Empo e1 = new Empo(101, "Deepak", 10000);
        Empo e2 = new Empo(102, "ajeet", 12000);
        Empo e3 = new Empo(103, "karan", 13000);
        Empo e4 = new Empo(104, "mohan", 14000);

        s.add(e1);
        s.add(e2);
        s.add(e3);
        s.add(e4);
        System.out.println(s);
    }
}
