
//Q.1 Write a java  program to find and print Prime numbers in a given Array
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Array ELement");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j < arr.length - 1; j++) {
                if (arr[i] % j != 0) {
                    System.out.println(j);
                }
            }
        }
    }
}
