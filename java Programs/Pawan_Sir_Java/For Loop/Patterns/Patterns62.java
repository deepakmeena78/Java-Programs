/*              1
               1 2
              1 2 3
             1 2 3 4
            1 2 3 4 5
 */
import java.util.Scanner;
public class Patterns62 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int a = 0;
            for (int j = 1; j <= num; j++) {
                if (j >= num+1-i) {
                    a++;
                   System.out.print(" "+a);
                } else  
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
    
