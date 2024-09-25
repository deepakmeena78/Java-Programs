import java.util.Scanner;

public class TryC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, fact = 1;
        try {
            n = Integer.parseInt(sc.next());
        } catch (Exception e) {
            System.out.println(e);
        }
        if (n <= 0) {
            System.out.println("Fact is only of natural number");
        } else {
            for (int i = 2; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println(fact);
        }
    }
}