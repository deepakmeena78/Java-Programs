
import java.util.Scanner;

public class Q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int num2 = sc.nextInt();

        int arr1[][] = new int[num2][num1];
        int arr[][] = new int[num2][num1];

        for (int i = 0; i < num2; i++) {
            System.out.print("Enter " + num1 + " elements of row" + (i + 1) + " :");
            for (int j = 0; j < num1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < num2; i++) {
            for (int j = 0; j < num1; j++) {
                arr[i][j] = arr1[j][i];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
