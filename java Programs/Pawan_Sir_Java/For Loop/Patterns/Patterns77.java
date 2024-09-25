/*          5 5 5 5 5
             4 4 4 4
              3 3 3
               2 2
                1
 */
import java.util.Scanner;
public class Patterns77 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt(),a = num;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= num + 1 - i; k++) {
                System.out.print(" "+a);
            }
            System.out.println();
            a--;
        }
    }
}

    
