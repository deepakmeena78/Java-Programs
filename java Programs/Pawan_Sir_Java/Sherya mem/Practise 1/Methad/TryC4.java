import java.util.Scanner;

public class TryC4 {
    public static void m1(int a) {
        if (a < 18) {
            throw new ArithmeticException("inValid");
        } else {
            System.out.println("Valid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        try {
            m1(n);
        } catch (Exception e) {
            System.out.println("Not Valid");
        }
    }
}
