
/*          55555
             4__4
              3_3
               22
                1
 */
import java.util.Scanner;

public class Patterns57 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();
        int a = num;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j >= i && j <= num) {
                    if (j == num || i == j || i == 1) {
                        System.out.print(" " + a);
                    } else {
                        System.out.print(" _");
                    }
                } else
                    System.out.print("  ");
            }
            System.out.println();
            a--;
        }
    }
}