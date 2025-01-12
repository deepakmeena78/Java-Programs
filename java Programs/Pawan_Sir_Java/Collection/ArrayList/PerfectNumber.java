//3. WAP to store integer values in arraylist and display only those numbers which are perfect numbers.

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList<Integer>();

        System.out.println("Enter Numbers : ");
        for (int i = 0; i < 5; i++) {
            al.add(sc.nextInt());
        }

        int temp = 0;
        ListIterator it = al.listIterator();
        while (it.hasNext()) {
            temp = ((Integer) it.next());
            int sum = 0;
            for (int i = 1; i < temp; i++) {
                if (temp % i == 0) {
                    sum += i;
                }
            }
            if (temp == sum) {
                System.out.println("This is Perfect Number : " + temp);
            }
            temp = 0;
        }
    }
}