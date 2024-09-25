
//14. Write a Java program to remove all elements from a linked list.
//    Hashset
import java.util.*;

public class Assi14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList l = new LinkedList<>();

        System.out.println("10 Value Any");
        for (int i = 0; i < 10; i++) {
            String s = sc.next();
            l.add(i, s);
        }
        System.out.println("Obj Value : " + l);
        l.clear();

        System.out.print("Remove All Element : " + l);
    }
}
