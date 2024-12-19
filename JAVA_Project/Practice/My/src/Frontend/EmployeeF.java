package Frontend;

import Backend.Employee;

public class EmployeeF {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Employee obj = new Employee(101, "Ankit", 30000);
        Employee obj1 = new Employee(102, "Deepak", 25000);
        Employee obj2 = new Employee(103, "InfoBeans", 25000);
        Employee obj3 = new Employee(102, "Batch-10th", 25000);

        Employee arr[] = new Employee[4];
        arr[0] = obj;
        arr[1] = obj1;
        arr[2] = obj2;
        arr[3] = obj3;

        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i].getName());
        }
        
        System.out.println("_________________________________________________________");
        
        for(Employee x : arr){
            System.out.println(x.getName());
        }
    }
}
