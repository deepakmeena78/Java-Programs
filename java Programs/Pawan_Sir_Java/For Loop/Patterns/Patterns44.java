import java.util.Scanner;

//      5
//     44
//    333
//   2222
//  11111
public class Patterns44 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row;
        System.out.println("Enter num of row");
        row = sc.nextInt();

        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= row; j++) {
                if (j >= i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
