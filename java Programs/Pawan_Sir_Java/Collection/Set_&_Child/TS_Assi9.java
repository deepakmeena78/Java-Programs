
// 8.Write a Java program to create a reverse order view of the elements
//   contained in a given tree set.
import java.util.*;

public class TS_Assi9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet ts = new TreeSet<>();
        System.out.println("Enter 5 Element :");
        for (int i = 0; i < 5; i++) {
            String s = sc.next();
            ts.add(s);
        }
        Object arr[] = new Object[5];
        int temp = 0;
        Iterator i = ts.iterator();
        while (i.hasNext()) {
            arr[temp] = i.next();
            temp++;
        }
        System.out.print("Your Value : ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }

        System.out.println();

        System.out.print("Revers Value : ");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}
