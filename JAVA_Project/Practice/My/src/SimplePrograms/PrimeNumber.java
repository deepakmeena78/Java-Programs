package SimplePrograms;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter Number");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int local = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = 2; j < temp; j++) {
                if (temp % j == 0) {
                    sum++;
                }
            }
            if (sum == 0) {
                local++;
                System.out.println("Prinme Number : "+temp);
            }
            sum = 0;
        }
        System.out.println("Totl Prinme Numbers : "+local);
    }
}
