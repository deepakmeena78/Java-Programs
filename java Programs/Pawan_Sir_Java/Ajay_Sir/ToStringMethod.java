class Person {
    int id;
    String name;
    double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(int id, String name, double salary) {
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
        return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    Person() {

    }

}

public class ToStringMethod {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person p = new Person(101, "deepka", 10000);
        Person p1 = new Person(101, "deepak", 10000);
        System.out.println(p);
        System.out.println(p1);

    }
}

/*
 * Here we have discussed about the Equals() method in java.
 * which is in the object class of java
 * And its default implementation is in the Object class which is in the
 * java.lang package
 * And it has default behaviour which is to compare the object reference and
 * address
 * which we have to override it in the sub class that we are creating
 */