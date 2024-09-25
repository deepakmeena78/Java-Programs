/*            *
             ***
            ***** 
           ******* 
            ***** 
             *** 
              *
 */
import java.util.Scanner;
public class Patterns84 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number");
        int num = sc.nextInt();
        
        for(int i = 1;i <= num;i++){
            for(int j = 1;j <= num-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k <= i+i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1;i <= num;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(" ");
            }
            for(int k = (num+num-2)-i;k >= i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
