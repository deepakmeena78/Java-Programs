import java.util.Scanner;

public class ReverseArr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Number");
        int size = sc.nextInt();
        int arr[] = new int[size];// User Size in Array

        for (int i = 0; i < size; i++) {// Declartion Array
            arr[i] = sc.nextInt();
        }
        for (int i = arr.length-1; i >= 0; i--) {// Print Array
            System.out.print(arr[i]);
        }
    }
}
