/*      Input: arr = [1, 345, 234, 21, 56789]
        Output: 1 56789
        Explanation: minimum and maximum element of array are 1 and 56789.
 */

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.println("Enter Array 10 Element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int mini = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (mini > arr[i]) {
                mini = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Min : " + mini);
        System.out.println("Max : " + max);
    }
}