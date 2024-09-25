/*              1
               1*1
              1***1
             1*****1
            111111111
 */
import java.util.Scanner;
public class Patterns70 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j >= num + 1 - i) {
                    System.out.print("");
                    if (j == num || i == num || i + j == num+1) {
                        System.out.print(" 1");
                    } else {
                        System.out.print(" *");
                    }
                } else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}

