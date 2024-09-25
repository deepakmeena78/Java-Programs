import java.util.Scanner;

public class NotSame14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array -: ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {// User input Array
            arr[i] = sc.nextInt();
        }

        int count[] = new int[arr.length];// Temprery Array
        for (int i = 0; i < arr.length; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {//Find Duplicate
                if (i != j && arr[i] == arr[j]) {
                    count[i]++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {//Print Array
            if (count[i] == 0) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
