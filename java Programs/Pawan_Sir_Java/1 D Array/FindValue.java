import java.util.Scanner;

public class FindValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Number");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Number");
            arr[i] = sc.nextInt();
        }

        System.out.println("Target Number");
        int target = sc.nextInt();
        int count = 0;

        for (int j = 0; j < arr.length; j++) {
            if (target == arr[j]) {
                count++;
            }
        }
        System.out.println(target + "Target Time  " + count);
    }
}