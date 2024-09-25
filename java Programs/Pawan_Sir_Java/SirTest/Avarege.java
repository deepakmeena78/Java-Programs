import java.util.Scanner;

public class Avarege {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int s = sc.nextInt();

        int arr[] = new int[s];
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int l = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Avarge Value :" + sum / l);
    }
}
