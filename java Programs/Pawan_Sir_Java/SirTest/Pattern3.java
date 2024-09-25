//          *     *
//          **   **
//          *** ***
//          *******
public class Pattern3 {
    public static void main(String[] args) {

        int a = 5;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = a; j >= 1; j--) {
                System.out.print(" ");
            }
            a = a - 2;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
