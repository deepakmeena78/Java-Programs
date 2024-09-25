import java.util.Scanner;

public class SortArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Number");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int a = arr[0];

        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter Number");
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}