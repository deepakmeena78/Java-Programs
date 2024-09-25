/*
 *              *    
               * *   
              *****  
             *     * 
            *       *
 */
import java.util.Scanner;

public class A_Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num + num - 1; j++) {
                if (i + j == num + 1 || i + j == num + i + i - 1|| (num / 2) + 1 == i && j >= (num / 2) + 1 && j <= num + 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}