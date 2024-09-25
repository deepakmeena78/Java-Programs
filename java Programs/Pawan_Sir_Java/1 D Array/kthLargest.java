import java.util.Scanner;

public class kthLargest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Number");// User Array Size
        int sixe = sc.nextInt();
        int arr[] = new int[sixe];

        for (int i = 0; i < arr.length; i++) {// Declaration Array
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Largest Number");// User Input Of Largest
        int l = sc.nextInt();
        System.out.println("Enter Smalled Number");// User Input Of Smalled
        int s = sc.nextInt();

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {// Sort Array
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Small  " + arr[s - 1]);
        System.out.println("Larget  " + arr[arr.length - l]);
    }
}