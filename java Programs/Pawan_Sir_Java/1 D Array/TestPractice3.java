
//          Input: arr1[] = [1, 2, 3, 4, 5], 
//          Second arr2[] = [1, 2, 3]
//          Output: 5
import java.util.Scanner;

public class TestPractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size :");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int arr2[] = new int[n];
        int arr3[] = new int[n + n];

        System.out.println("First Array Element :");// First Array Decler
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Second Array Element :");// Second Array Decler
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int in = 0;
        for (int i = 0; i < arr.length; i++) {
            arr3[in] = arr[i];
            in++;
            arr3[in] = arr2[i];
            in++;
        }
        System.out.print("Your Values : ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        System.out.println();

        int count = 0;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = i + 1; j < arr3.length - 1; j++) {
                if (arr3[i] == arr3[j]) {
                    count++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr3[i] != arr3[j]) {
                    System.out.print(arr3[i]);
                }
            }
        }
        System.out.println();
        System.out.println("Total Union Value : " + (arr3.length - count));
    }
}
