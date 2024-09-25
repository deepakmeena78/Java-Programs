
//6 Write a Java program to iterate through all elements in a tree set..
import java.util.*;

public class TS_Assi7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet ts = new TreeSet<>();
        System.out.println("Enter 5 Value :");
        for (int i = 0; i < 5; i++) {
            String s = sc.next();
            ts.add(s);
        }
        System.out.println("Obj Value :" + ts);
        Iterator i = ts.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }

    }
}
