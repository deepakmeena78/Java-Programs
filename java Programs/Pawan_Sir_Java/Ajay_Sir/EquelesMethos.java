import java.util.Objects;

class Person2 {
    int id;
    String name;
    double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person2(int id, String name, double salary) {
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

    public boolean equals(Person2 p) {
        return this.id == p.id && this.name.equals(p.name) && this.salary == p.salary;
    }

    Person2() {

    }

}

public class EquelesMethos {
    public static void main(String[] args) {
        Person2 p = new Person2(101, "deepak", 10000);
        Person2 p1 = new Person2(101, "deepak", 10000);

        System.out.println(p.equals(p1));
    }
}
