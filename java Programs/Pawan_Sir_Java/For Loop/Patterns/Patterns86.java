/*
                    ***********
                    **       **
                    * *     * *
                    *  *   *  *
                    *   * *   *
                    *    *    *
                    *   * *   *
                    *  *   *  *
                    * *     * *
                    **       **
                    ***********
 */
import java.util.Scanner;
public class Patterns86 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for(int i = 1;i <= num;i++){
            for(int j = 1;j <= num;j++){
                if(j == num || i == num || i == 1 || j == 1 || i == j || i + j == num+1){
                     System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
