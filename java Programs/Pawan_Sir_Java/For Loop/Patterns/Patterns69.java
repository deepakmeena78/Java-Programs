/*          1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1
 */
import java.util.Scanner;
public class Patterns69 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            char ch = 64;
            for (int j = 1; j <= num - 1 + i; j++) {
                if (j >= num + 1 - i) {
                    ch++;
                    System.out.print(ch);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


