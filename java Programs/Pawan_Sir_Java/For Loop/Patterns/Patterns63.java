
/*              A
               A B
              A B C
             A B C D
            A B C D E  
 */
import java.util.Scanner;

public class Patterns63 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            char ch = 64;
            for (int j = 1; j <= num; j++) {
                if (j >= num + 1 - i) {
                    ch++;
                    System.out.print(" "+ ch);
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
