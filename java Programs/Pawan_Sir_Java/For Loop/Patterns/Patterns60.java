/*          11111
             2222
              333
               44
                5
 */
import java.util.Scanner;
public class Patterns60 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j >= i && j <= num) {
                   System.out.print(" "+i);
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}




