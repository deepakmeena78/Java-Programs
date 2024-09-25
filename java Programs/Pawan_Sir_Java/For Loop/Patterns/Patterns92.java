
/*
                    1
                   212
                  32123 
                 4321234
                543212345
 */
import java.util.Scanner;

public class Patterns92 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();
        int b = 0, a = num / 2 + 1;

        for (int i = 1; i <= num; i++) {
            int c = i <= num ? b++ : b--;
            for (int j = 1; j <= num + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + i - 1; k++) {
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
