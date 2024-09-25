
//13. Write a Java program to remove the first and last elements from a linked
//    list
import java.util.*;

public class Assi13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList l = new LinkedList<>();

        System.out.println("10 Value Any");
        for (int i = 0; i < 10; i++) {
            String s = sc.next();
            l.add(i, s);
        }
        System.out.println("Obj Value : " + l);
        l.removeFirst();
        l.removeLast();

        System.out.print("Remove First Or Last Element : ");
        for (int i = 0; i < 8; i++) {
            System.out.print(l.get(i) + " ");
        }

    }
}
