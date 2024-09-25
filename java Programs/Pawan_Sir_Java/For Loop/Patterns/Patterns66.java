
/*            1
             123
            12345
           1234567
          123456789

 */
import java.util.Scanner;

public class Patterns66 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int a = 0;
            for (int j = 1; j <= num - 1 + i; j++) {
                if (j >= num + 1 - i) {
                    a++;
                    System.out.print(a);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
