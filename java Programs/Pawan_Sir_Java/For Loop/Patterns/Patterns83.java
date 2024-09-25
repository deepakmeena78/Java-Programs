
/*              *
               *_*
              *_*_*
             *_*_*_*  
              *_*_*
               *_*
                *     
 */
import java.util.Scanner;

public class Patterns83 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();
        int n = (num / 2) + 1;
        int b = -1;

        for (int i = 1; i <= num; i++) {
            if (i >= n)
                b -= 2;
            else
                b += 2;

            for (int k = num; k >= b; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= b; j++) {
                if (j % 2 == 0)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
