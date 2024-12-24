package Backend;

import java.util.Scanner;

public class CalculateRoot {

    public void m1(int a) {
        double result = Math.sqrt(a);
        System.out.printf("%.1f", result);
    }

    public void m1(double a) {
        double result2 = Math.cbrt(a);
        System.out.printf("%.1f", result2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CalculateRoot c = new CalculateRoot();

        System.out.println("Enter Value : ");
        if (sc.hasNextInt()) {
            int value = sc.nextInt();
            c.m1(value);
        } else if (sc.hasNextDouble()) {
            double value2 = sc.nextDouble();
            c.m1(value2);
        } else {
            System.out.println("Invalid input!");
        }
    }
}
