/*          12345
             1234
              123
               12
                1
 */
import java.util.Scanner;
public class Patterns54 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= num+1-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
