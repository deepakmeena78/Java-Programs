import java.util.Scanner;

public class MinimumandMaximum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Number");
        int p = sc.nextInt();
        int arr[] = new int[p];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Number");
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
        System.out.println("Small  " + min + "\nGreater  " + max);
    }
}
