
/*          12345
             1__4
              1_3
               12
                1
 */
import java.util.Scanner;

public class Patterns56 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j >= i && j <= num) {
                    if (j == num || i == j || i == 1) {
                        System.out.print(" *");
                    } else {
                        System.out.print(" _");
                    }
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}