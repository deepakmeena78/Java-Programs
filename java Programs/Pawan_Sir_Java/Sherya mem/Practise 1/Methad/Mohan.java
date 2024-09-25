import java.util.Scanner;

public class Mohan {

    int age;
    double hight, wight;
    String number, cla, name;

    public Mohan(String name, int age, double hight, double wight, String cla, String number) {
        this.age = age;
        this.hight = hight;
        this.wight = wight;
        this.number = number;
        this.cla = cla;
        this.name = name;
    }

    public void m2() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Hight : " + hight);
        System.out.println("weait : " + wight);
        System.out.println("Class : " + cla);
        System.out.println("Number : " + number);
    }

    public static void main(String[] args) {
        String name1 = "", cla1 = "", number1 = "";
        int age1 = 0;
        double hight1 = 0.0, wight1 = 0.0;

        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        do {
            try {
                flag = false;
                System.out.println("Enter a Name");
                name1 = sc.nextLine();
                sc.next();

                System.out.println("Enter a Age");
                age1 = sc.nextInt();

                System.out.println("Enter a Hight");
                hight1 = sc.nextDouble();

                System.out.println("Enter a weait");
                wight1 = sc.nextDouble();

                System.out.println("Enter Class");
                cla1 = sc.next();

                System.out.println("Enter Your Number");
                number1 = sc.next();

            } catch (Exception e) {
                System.out.println("Your Input is Wrong Pleace Try Again");
                flag = true;
            }
        } while (flag);

        Mohan ab = new Mohan(name1, age1, hight1, wight1, cla1, number1);
        ab.m2();
    }
}
