
/*
                Arr = {1, 2, 3, 3, 2, 1}
                X = 2   
                Output: 2
                Explanation: Frequency of 2 is 2.
 */
import java.util.Scanner;

public class TestPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size :");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Element :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Find Value");
        int f = sc.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == f) {
                count++;
            }
        }
        System.out.println(f + " : Total Time : " + count);
    }
}
