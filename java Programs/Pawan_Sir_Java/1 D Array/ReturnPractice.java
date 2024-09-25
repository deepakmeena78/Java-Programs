
//Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
//Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
import java.util.Scanner;

public class ReturnPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int s = sc.nextInt();

        int arr[] = new int[s];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > arr[j + 1]){
                    
                }
            }
        }
    }
}