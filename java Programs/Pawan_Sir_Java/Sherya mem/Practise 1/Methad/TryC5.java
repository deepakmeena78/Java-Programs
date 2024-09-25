import java.util.Scanner;

public class TryC5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Widral Value");
        int a = sc.nextInt();
        System.out.println("Enter Account Balance");
        int b = sc.nextInt();
        TryC5 obj = new TryC5();
        obj.m1(a, b);
    }

    public static void m1(int a, int b) {
        try {
            if (a < b) {
                System.out.println("Widral " + a);
            }
        } catch (Exception e) {
            System.out.println("Not Valid");
        }
    }
}
