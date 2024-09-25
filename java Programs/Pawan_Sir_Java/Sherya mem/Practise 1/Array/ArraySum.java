import java.util.Scanner;

public class ArraySum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Number");
        int size = sc.nextInt();
        int arr[] = new int[size];// User Size in Array

        for (int i = 0; i < size; i++) {// Declartion Array
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {//Sum Array
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
