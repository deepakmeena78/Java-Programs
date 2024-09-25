import java.util.Scanner;

public class Greater {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Number");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}
