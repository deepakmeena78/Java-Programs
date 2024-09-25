
//9.Write a Java program to get the first and last elements in a tree set
import java.util.*;

public class TS_Assi10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet t = new TreeSet<>();
        System.out.println("Enter 5 Element :");
        for (int i = 0; i < 5; i++) {
            String s = sc.next();
            t.add(s);
        }

        System.out.println("Your Value : " + t);
        System.out.println("First : " + t.first());
        System.out.println("Last : " + t.last());
    }
}
