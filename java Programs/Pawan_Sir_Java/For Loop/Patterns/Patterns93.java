import java.util.Scanner;

public class Patterns93 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
