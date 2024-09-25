import java.util.Scanner;

public class Q_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Number");// Inport Array Size
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Number");// Decleration Array
            arr[i] = sc.nextInt();
        }

        for (int b = 0; b < arr.length; b++) {
            int kam = 0;
            for (int i = 0; i < 1; i++) {
                int last = 0;
                last = arr[arr.length - i - 1];

                for (int j = arr.length - i - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i] = last;
            }
            for (int i = 0; i < arr.length; i++) {
                kam = kam + arr[i] * i;
                System.out.print(arr[i] + " ");
            }
            System.out.println(kam); 
        }
    }
}