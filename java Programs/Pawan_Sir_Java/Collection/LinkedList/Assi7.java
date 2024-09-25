//7. Write a Java program to insert the specified element at the front of a linked
//   list.

import java.util.LinkedList;

public class Assi7 {
    public static void main(String[] args) {

        LinkedList l = new LinkedList<>();
        LinkedList l1 = new LinkedList<>();
        l.add(3);
        l.add(2);
        l.add(8);
        l.add(6);
        l.add(9);
        System.out.println("Obj1 : " + l);
        l1.add(5);
        l1.add(7);
        l1.add(4);
        System.out.println("Obj2 : " + l1);

        for (int i = l1.size() - 1; i >= 0; i--) {
            l.addFirst(l1.get(i));
        }
        System.out.print("Obj1 + Obj2 = Add First : ");
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
    }
}
