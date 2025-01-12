import java.util.Objects;

class Person3 {
    int id;
    String name;
    double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person3(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return id + name + salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

}

public class HashCode {
    public static void main(String[] args) {
        Person3 p = new Person3(101, "deepak", 10000);
        Person3 p1 = new Person3(101, "deepak", 10000);

        System.out.println(p.hashCode());
        System.out.println(p1.hashCode());
    }
}