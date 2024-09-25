abstract class A1 {
    String name;
    int age;
}

class A2 extends A1 {
    int roll;
    int mark;

    A2(String name, int age, int roll, int mark) {
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.mark = mark;
        System.out.println("Name : " + this.name + " \nAge : " + this.age);
        System.out.println("Roll Number : " + this.roll + " \nMark : " + this.mark);
    }
}

class A3 extends A1 {
    int bonus;
    double salary;

    A3(String name, int age, int bonus, int salary) {
        this.name = name;
        this.age = age;
        this.bonus = bonus;
        this.salary = salary;
        System.out.println("Name : " + this.name + " \nAge : " + this.age);
        System.out.println("Bonus : " + this.bonus + " \nSalary : " + this.salary);
    }
}

public class Practice17 {
    public static void main(String[] args) {
        A2 a2 = new A2("Deepak", 19, 101, 90);
        A3 a3= new A3("Ankit", 19, 5000, 30000);
    }

}
