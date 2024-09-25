
/*              1
               10
              101
             1010
            10101
 */
import java.util.Scanner;

public class Patterns53 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int k = num; k >= i; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2);
            }
            System.out.println();
        }
    }
}
