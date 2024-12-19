package SimplePrograms;

import java.util.Collection;
import java.util.*;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[1];

        System.out.println("Enter Number");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList ar = new ArrayList();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            
            for (int j = 1; j < temp; j++) {
                if (temp % j == 0) {
                    ar.add(j);
                    sum = sum + j;
                }
            }
            if (sum == temp) {
                System.out.println(ar);
                System.out.println("Perfect Number : " + sum);
            }
            sum = 0;
            ar.clear();
        }
    }
}
