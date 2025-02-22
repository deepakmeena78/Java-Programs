import java.util.*;


class Demo implements Comparable<Demo> {
    int roll;
    String name;
    double mark;

    public Demo(int roll, String name, double mark) {
        this.roll = roll;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public int compareTo(Demo o) {
        if (this.roll > o.getRoll()) {
            return -1;
        } else if (this.roll < this.getRoll()) {
            return +1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Demo [roll=" + roll + ", name=" + name + ", mark=" + mark + "]";
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }
}

public class Student {
    public static void main(String[] args) {

        Demo d1 = new Demo(101, "ajeet", 87);
        Demo d2 = new Demo(102, "ankit", 83);
        Demo d3 = new Demo(103, "meena", 97);
        Demo d4 = new Demo(104, "jayesh", 88);
        List<Demo> a = new ArrayList<Demo>();

        a.add(d1);
        a.add(d2);
        a.add(d3);
        a.add(d4);
        Collections.sort(a);
        System.out.println(a);
    }
}
