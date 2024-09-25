
/*              1
               11
              1*1
             1**1
            11111
 */
import java.util.Scanner;

public class Patterns51 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j >= (num + 1) - i) {
                    if (j + i == num + 1 || j == num || i == num) {
                        System.out.print(" 1");
                    } else {
                        System.out.print(" *");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}