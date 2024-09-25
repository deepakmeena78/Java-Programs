/*                  A
                   AB
                  A_C
                 A__D
                ABCDE
 */
import java.util.Scanner;
public class Patterns52 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            char ch = 65;
            for (int j = 1; j <= num; j++) {
                if (j >= (num + 1) - i) {
                    if (j + i == num + 1 || j == num || i == num) {
                        System.out.print(" "+ch);
                    } else {
                        System.out.print(" _");
                    }
                ch++;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}