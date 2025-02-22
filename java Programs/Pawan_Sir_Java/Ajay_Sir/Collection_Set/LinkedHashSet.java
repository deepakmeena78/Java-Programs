import java.util.*;
import java.util.Set;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
            return false;
        return true;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    public double getSalary() {
        return salary;
    }

}

public class LinkedHashSet {
    public static void main(String[] args) {

        Employee obj1 = new Employee(101, "Meena JI", 500000);
        Employee obj2 = new Employee(102, "ajeet", 400000);
        Employee obj3 = new Employee(103, "vipin", 300000);
        Employee obj4 = new Employee(104, "karan", 540000);

        Set<Employee> s = new java.util.LinkedHashSet<>();
        s.add(obj1);
        s.add(obj2);
        s.add(obj3);
        s.add(obj4);
        s.add(obj4);
        System.out.println(s);
    }
}
