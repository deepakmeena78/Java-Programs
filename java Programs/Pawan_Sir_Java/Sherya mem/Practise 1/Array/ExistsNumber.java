import java.util.Scanner;

public class ExistsNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Number");
        int size = sc.nextInt();
        int arr[] = new int[size];// User Size in Array

        for (int i = 0; i < size; i++) {// Declartion Array
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Find Value");// User Find Value
        int num = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.print("Find Complet");
            }
        }
    }
}
