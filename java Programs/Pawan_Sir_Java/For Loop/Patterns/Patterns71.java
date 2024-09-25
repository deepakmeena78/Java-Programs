/*                   A
                    B B
                   C  C
                  D    D
                EEEEEEEEE
 */
import java.util.Scanner;
public class Patterns71 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();
        char ch = 65;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j >= num + 1 - i) {
                    System.out.print("");
                    if (j == num || i == num || i + j == num+1) {
                        System.out.print(" "+ch);
                    } else {
                        System.out.print("  ");
                    }
                } else
                    System.out.print(" ");

            }
            ch++;
            System.out.println();
        }
    }
}

