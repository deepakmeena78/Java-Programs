import java.util.Scanner;

public class Sumarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array Size");
        int s = sc.nextInt();

        int arr[] = new int[s];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        System.out.println("Sum " + total);
    }

}
