
/*               1
                12
               123
              1234
               123
                12
                 1
 */
import java.util.Scanner;

public class Patterns82 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();
        int c = num / 2;
        int b = 0;
        
        for (int i = 1; i <= num; i++) {
            int a = i <= c ? b++ : b--;
            int d = 1;
            for (int j = 1; j <= c; j++) {
                if (j >= c+1-b) {
                    System.out.print(d++);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
