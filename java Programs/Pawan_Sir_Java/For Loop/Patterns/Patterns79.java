
/*          123456789
             1+++++7
              1+++5
               1+3
                1
 */
import java.util.Scanner;

public class Patterns79 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int a = 1;
            for (int j = 1; j <= num + num - i; j++) {
                if (j >= i && j <= (num + num) - i) {
                    if (i == j || j >= (num + num) - i || i == 1) {
                        System.out.print(a++);
                    } else if (j >= i) {
                        a++;
                        System.out.print("+");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
