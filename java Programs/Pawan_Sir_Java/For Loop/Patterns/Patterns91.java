/*              1
                2
                3
                4
            123454321
     xx         4
                3
                2
                1
 */
import java.util.Scanner;
public class Patterns91 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();
        int a = num+num-1,b = 0;

        for(int i = 1;i <= a;i++){
            int c = i <= num ? b++ : b--;
            for(int j = 1;j <= a;j++){
                if(i == num || j == num){
                    System.out.print(b);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
