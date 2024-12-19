package Backend;

public class Employee {
  
       private int id;
       private String name;
       private int salary;

    @Override
    public String toString() {
        return "Emlpoyee{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';
    }
       
    public void setId(int id) {
        this.id = id;
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
       public void get(){
    }
}
