
/*
                1
               212
              32123 
             4321234
            543212345
*/
import java.util.Scanner;

public class Patterns48 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        int a = num;
        for (int i = 1; i <= num; i++) {
            for (int j = a; j > 1; j--) {
                System.out.print(" ");
            }
            a--;
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
