/*              A B C D E
                 A B C D
                  A B C
                   A B
                    A
 */
import java.util.Scanner;
public class Patterns76 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            char ch = 64;
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= num + 1 - i; k++) {
                ch++;
                System.out.print(" "+ch);
            }
            System.out.println();
        }
    }
}

