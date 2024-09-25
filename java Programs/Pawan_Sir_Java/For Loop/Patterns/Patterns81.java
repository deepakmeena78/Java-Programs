/*              1
                12
                123
                1234
                123
                12
                1
 */
import java.util.Scanner;
public class Patterns81 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();
        int tem = 1,dev = num/2;

        for (int i = 1; i <= dev; i++) {
            for (int j = 1; j <= tem; j++) {
                System.out.print(j);
            }
            tem++;
            System.out.println();
        }
        for (int k = 1;k <= num;k++) {
            for(int p = 1;p <= tem;p++){
                System.out.print(p);
            }
            tem--;
            System.out.println();
        }
    }
}

