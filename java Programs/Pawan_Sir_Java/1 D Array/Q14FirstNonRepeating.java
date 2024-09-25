import java.util.Scanner;

public class Q14FirstNonRepeating {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Arrays Size ");// User Array Size
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter Element");// Array Declaration
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.print(arr[i]);
            }
        }
    }
}
