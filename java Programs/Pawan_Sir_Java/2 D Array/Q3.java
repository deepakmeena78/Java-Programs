import java.util.Scanner;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = {
                { 4, 6, 2 },
                { 9, 4, 1 },
                { 5, 8, 3 }
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j > i) {
                    System.out.print(" " + arr[i][j]);
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j < i) {
                    System.out.print(" " + arr[i][j]);
                }
            }
        }
    }
}