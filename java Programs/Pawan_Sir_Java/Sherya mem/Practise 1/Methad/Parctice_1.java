import java.util.Scanner;

class Parameter {
    private int length;
    private int breadth;

    void setArea(int a, int b) {
        this.length = a;
        this.breadth = b;
    }

    int getArea() {
        return length * breadth;
    }
}

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Parameter p1 = new Parameter();
        System.out.println("Enter Length Or Breadth");
        int num = sc.nextInt();
        int num1 = sc.nextInt();

        p1.setArea(num1, num);
        int x = p1.getArea();
        System.out.println(x);
    }
}
