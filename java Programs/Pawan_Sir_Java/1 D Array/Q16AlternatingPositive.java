import java.util.Scanner;

public class Q16AlternatingPositive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Arrays Size ");// User Array Size
        // int size = sc.nextInt();
        // int arr[] = new int[size];

        // System.out.print("Enter Element");// Aray1 Declaration
        // for (int i = 0; i < size; i++) {
        // arr[i] = sc.nextInt();
        // }
        // int arr[] = { 9, 4, -2, -1, 5, 0, -5, -3, 2 };
        // 9 -2 4 -1 5 -5 0 -3 2
        // 9-25-52-1-304
        int arr[] = { 4, -6, 7, -3, 6, -1, 2 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j += 2) {
                if (j >= 0 || j % 2 == 0) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                } else {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}