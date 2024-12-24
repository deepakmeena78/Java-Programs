class Add {
    int id;
    String name;

    public Add(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
    }
}

class Employee extends Add {
    int salary;

    public Employee(int id, String name, int salary) {
        super(id, name);
        this.salary = salary;
    }

    void display() {
        super.display();
        System.out.println("Salary : " + salary);
    }
}

public class Person {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Ankit", 40000);
        e.display();
    }
}