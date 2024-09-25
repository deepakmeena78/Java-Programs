import java.util.Scanner;

public class Sum_of_Matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Number of Columns: ");
        int num2 = sc.nextInt();

        int arr[][] = new int[num1][num2];
        int arr1[][] = new int[num1][num2];
        int ans[][] = new int[num1][num2];

        System.out.println("Enter Element of First Matrix");
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.println("Enter value of row " + (i + 1) + " and Column " + (j + 1));
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Element of Second Matrix");
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.println("Enter value of row " + (i + 1) + " and Column " + (j + 1));
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                ans[i][j] = arr[i][j] * arr1[i][j];
            }
        }
        System.out.println("Sum of Two MAtrix");
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
