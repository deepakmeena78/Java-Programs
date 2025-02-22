import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

class Test {
    int id;
    String name;
    int salary;

    Test(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Id: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class RealLife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Test> ar = new ArrayList<>();

        System.out.println("Enter Id: ");
        int id = sc.nextInt();

        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Salary: ");
        int salary = sc.nextInt();

        ar.add(new Test(id, name, salary));

        Iterator<Test> iterator = ar.iterator();
        while (iterator.hasNext()) {
            iterator.next().display();
        }

        ListIterator<Test> listIterator = ar.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next().display();
        }
    }
}
