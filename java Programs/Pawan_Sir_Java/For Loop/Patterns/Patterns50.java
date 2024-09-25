import java.util.Scanner;

/*             A
              AB
             ABC
            ABCD
           ABCDE
*/
public class Patterns50 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of row");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            char ch = 65;
            for (int j = 1; j <= num; j++) {
                if (j >= i) {
                    System.out.print(ch);
                    ch++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
