import java.util.Scanner;

public class ThreeCombo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Number of Columns: ");
        int num2 = sc.nextInt();

        int arr[][] = new int[num1][num2];
        int arr1[][] = new int[num1][num2];

        for (int i = 0; i < num1; i++) {
            System.out.print(" Row " + num1 + " Elements Of Row : " + (i + 1) + " : ");
            for (int j = 0; j < num2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < num1; i++) {
            System.out.print(" Row " + num1 + " Elements Of metrix 2 : " + (i + 1) + " : ");
            for (int j = 0; j < num2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Plus ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int plus = arr[i][j] + arr1[i][j];
                System.out.print(" : " + plus);
            }
        }
        System.out.println();
        System.out.print("Maynas ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int mainas = arr[i][j] - arr1[i][j];
                System.out.print(" : " + mainas);
            }
        }

        System.out.println();
        System.out.print("Guna ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int guna = arr[i][j] * arr1[i][j];
                System.out.print(" : " + guna);
            }
        }
    }
}