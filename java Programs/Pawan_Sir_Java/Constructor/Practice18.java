abstract class B1 {
    String name;
    int age;

    B1(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name : " + this.name + " \nAge : " + this.age);
    }
}

class B2 extends B1 {
    int roll;
    int mark;

    B2(String name, int age, int roll, int mark) {
        super(name, age);
        this.roll = roll;
        this.mark = mark;
        System.out.println("Roll Number : " + this.roll + " \nMark : " + this.mark);
    }
}

class B3 extends B1 {
    int bonus;
    double salary;

    B3(String name, int age, int bonus, int salary) {
        super(name, age);
        this.bonus = bonus;
        this.salary = salary;
        System.out.println("Bonus : " + this.bonus + " \nSalary : " + this.salary);
    }
}

public class Practice18 {
    public static void main(String[] args) {
        A2 a2 = new A2("Deepak", 19, 101, 90);
        A3 a3 = new A3("Ankit", 19, 5000, 30000);
    }

}