
/*          ABCDE
             A__D
              A_C
               AB
                A
 */
import java.util.Scanner;

public class Patterns58 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            char ch = 65;
            for (int j = 1; j <= num; j++) {
                if (j >= i && j <= num) {
                    if (j == num || i == j || i == 1) {
                        System.out.print(" " + ch);
                    } else {
                        System.out.print(" _");
                    }
                    ch++;
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
