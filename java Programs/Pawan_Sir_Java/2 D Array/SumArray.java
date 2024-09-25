import java.util.Scanner;

public class SumArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = {
                { 4, 6, 2 },
                { 9, 4, 1 },
                { 5, 8, 3 }
        };
        int sum = 0, odd = 0, even = 0;
        for (int a[] : arr) {
            for (int b : a) {
                sum = sum + b;
                if (b % 2 == 0) {
                    even = even + b;
                } else {
                    odd = odd + b;
                }
            }
        }
        System.out.println("sum  " + sum);
        System.out.println("even  " + even);
        System.out.println("odd  " + odd);
    }
}