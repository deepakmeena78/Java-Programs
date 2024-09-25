class Parson1 {
    String name;
    int age;

    Parson1(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public void sup() {
        System.out.println("Name : " + this.name + " \nAge : " + this.age);
    }
}

class Text01 extends Parson1 {
    int roll;
    int mark;

    Text01(String name, int age, int roll, int mark) {
        super(name, age);
        this.roll = roll;
        this.mark = mark;
    }

    public void sup1() {
        sup();
        System.out.println("Roll Number : " + this.roll + " \nMarks : " + this.mark);
    }
}

public class Practice11 {
    public static void main(String[] args) {
        Text01 te12 = new Text01("Ankit", 19, 01, 88);
        te12.sup1();
    }
}