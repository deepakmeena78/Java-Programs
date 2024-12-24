package Frontend;

import java.util.Scanner;

class Emplo {

    private int id;
    private float salary;

    public Emplo(int id, Float salary) {
        this.id = id;
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }
}

class Emplo2 extends Emplo {

    public Emplo2(int id, float salary) {
        super(id, salary);
    }

   public int getLevel() {
        if (getSalary() > 100) {
            return 1;
        } else {
            return 2;
        }
    }
}

public class EmployeeAss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Id : ");
        int i = sc.nextInt();

        System.out.println("Enter Salary : ");
        float f = sc.nextFloat();

        Emplo2 e = new Emplo2(i, f);

        System.out.println(e.getLevel());
    }
}
