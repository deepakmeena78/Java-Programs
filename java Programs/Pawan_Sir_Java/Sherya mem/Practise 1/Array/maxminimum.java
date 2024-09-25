import java.util.Scanner;

public class maxminimum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Number");
        int size = sc.nextInt();
        int arr[] = new int[size];// User Size in Array

        for (int i = 0; i < size; i++) {// Declartion Array
            arr[i] = sc.nextInt();
        }

        int min = arr[0], max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(max + " maximum " + min + " Minimum ");
    }
}
