
/*
        54321
        5432
        543
        54
        5
*/
import java.util.Scanner;

class Patterns41 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}