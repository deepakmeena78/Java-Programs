import java.util.Scanner;

public class ReversetheArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Number");
        int p = sc.nextInt();
        int arr[] = new int[p];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Number");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
