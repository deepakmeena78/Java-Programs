
//8. Write a Java program to insert the specified element at the end of a linked
//   list.
import java.util.*;

public class Assi8 {
    public static void main(String[] args) {

        LinkedList l = new LinkedList<>();
        LinkedList l1 = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println("Obj1 : " + l);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        System.out.println("Obj2 : " + l1);

        for (int i = 0; i < l1.size(); i++) {
            l.addLast(l1.get(i));
        }
        System.out.print("Obj1 + Obj2 = Add Last : ");
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
    }
}
