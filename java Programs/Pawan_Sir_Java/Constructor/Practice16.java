abstract class S {
    String name;
    int age;
}

class SS extends S {
    int roll;
    int mark;

    SS(String name, int age, int roll, int mark) {
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.mark = mark;
        System.out.println("Name : " + this.name + " \nAge : " + this.age);
        System.out.println("Roll Number : " + this.roll + " \nMark : " + this.mark);
    }
}

public class Practice16 {
    public static void main(String[] args) {
        SS s = new SS("Ankit", 19, 101, 89);
    }
}
