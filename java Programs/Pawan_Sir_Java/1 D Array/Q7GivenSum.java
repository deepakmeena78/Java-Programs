import java.util.Scanner;

public class Q7GivenSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Number");// User Array Size
        int sixe = sc.nextInt();
        int arr[] = new int[sixe];

        System.out.println("Enter Array Element : ");
        for (int i = 0; i < arr.length; i++) {// Declaration Array
            arr[i] = sc.nextInt();
        }

        System.out.println("Find Sum");// User Sum
        int sum = sc.nextInt();
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            temp = temp + arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                temp = temp + arr[j];
                if (temp == sum) {
                    System.out.println((i + 1) + " : " + (j + 1));
                    System.exit(0);
                }
            }
            temp = 0;
        }
    }
}
