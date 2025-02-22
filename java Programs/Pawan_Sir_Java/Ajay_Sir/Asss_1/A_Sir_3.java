
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

class Employee{

    int id;
    String name;
    double salary;

    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
    
    
}

class ArrayList2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of employees : ");
        int employees = sc.nextInt();

        ArrayList<Employee> al = new ArrayList<Employee>(employees);

        for(int i = 0; i < employees ;i++){

            System.out.print("Enter employee id of "+(i+1)+" : ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter employee name : ");
            String name = sc.nextLine();

            System.out.print("Enter salary : ");
            double salary = sc.nextDouble();

            al.add(new Employee(id, name, salary));
        }

        // for(Employee e : al){

        //     System.out.println(e);
        // }

        // Iterator<Employee> itr = al.iterator();

        // while(itr.hasNext()){

        //     Employee e = itr.next();

        //     System.out.println(e);
        // }

        ListIterator<Employee> ltr = al.listIterator();

        while(ltr.hasNext()){

            Employee e = ltr.next();

            System.out.println(e);
        }
    }
}
