import java.util.Scanner;

public class PeekElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array -: ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) {
                System.out.println("1");
                System.exit(0);
            }
        }
        System.out.println("0");
    }
}