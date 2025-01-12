import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Person {
    int id;
    String name;
    int salary;

    public Person(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    @Override
    public String toString() {
        return id + name + salary;
    }

}

public class Ajay_sir {
    public static void main(String[] args) {

        List<Person> l = new ArrayList<Person>();
        Person p = new Person(101, "Ankit", 48888);
        Person p1 = new Person(102, "Meena", 477777);
        Person p2 = new Person(103, "Ajeet", 4666666);
        Person p3 = new Person(104, "Vipin", 455555);
        Person p4 = new Person(105, "Karan", 4222222);

        l.add(p);
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p4);

        // for (Person person : l) {
        // if (person.getId() > 103) {
        // System.out.println(person.getName());
        // }
        // }

        ListIterator itr = l.listIterator();
        while (itr.hasNext()) {
            String s = ((String) itr.next());
            if (s.startsWith("a")) {
                itr.remove();
            }
        }
        System.out.println(l);
    }
}