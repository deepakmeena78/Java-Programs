
//      Input: arr = [9, 8, 7, 6, 4, 2, 1, 3]
//      Output: [3, 9, 8, 7, 6, 4, 2, 1]
import java.util.Scanner;

public class TestPractice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = arr[(arr.length - 2) - i];
            arr[(arr.length - 2) - i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
