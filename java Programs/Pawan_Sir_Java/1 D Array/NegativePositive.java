import java.util.Scanner;

public class NegativePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array -: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {// User input Array
            arr[i] = sc.nextInt();
        }

        int temp2[] = new int[size];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                temp2[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp2[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < temp2.length; i++) {
            System.out.print(temp2[i] + " ");
        }
    }
}