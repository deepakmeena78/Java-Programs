/*          Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
            Output:  7
            Explanation: 3rd smallest element in the given array is 7.
 */
import java.util.Scanner;

public class Smallest3rd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[6];
        System.out.println("Enter Array 6 Element");
        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}