
//7.Write a Java program to add all the elements of a specified tree set to
//  another tree set.
import java.util.*;

public class TS_Assi8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet ts = new TreeSet<>();
        TreeSet ts1 = new TreeSet<>();
        System.out.println("Obj1 :> Enter 5 Element :");
        for (int i = 0; i < 5; i++) {
            String s = sc.next();
            ts.add(s);
        }
        System.out.println("Obj2 :> Add 2 Element");
        for (int i = 0; i < 2; i++) {
            String s1 = sc.next();
            ts1.add(s1);
        }
        ts.addAll(ts1);

        System.out.print("Add All Element : ");
        Iterator i = ts.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }

    }
}
