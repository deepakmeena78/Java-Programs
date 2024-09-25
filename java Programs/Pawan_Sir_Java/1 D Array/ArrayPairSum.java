import java.util.Scanner;

public class ArrayPairSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Number");// User Array Size
        int sixe = sc.nextInt();
        int arr[] = new int[sixe];

        for (int i = 0; i < arr.length; i++) {// Array Declare
            System.out.println("Enter Number");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Sum Value");// User Sum Value
        int sum = sc.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {// Check Array Sum
                if (arr[i] + arr[j] == sum) {
                    count++;
                }
            }
        }
        System.out.print("pair  " + count);
    }
}