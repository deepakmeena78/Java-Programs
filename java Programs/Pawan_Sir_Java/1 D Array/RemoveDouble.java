import java.util.Scanner;

public class RemoveDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size :");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Array Element :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i == arr[j]) {
                    i++;
                    arr[count] = arr[i];
                    count++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
