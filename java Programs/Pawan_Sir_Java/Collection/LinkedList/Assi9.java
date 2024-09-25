//9. Write a Java program to insert some elements at the specified position into
//   a linked list.

import java.util.LinkedList;

public class Assi9 {
    public static void main(String[] args) {

        LinkedList l = new LinkedList<>();
        LinkedList l1 = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println("Obj1 : " + l);
        l.add(1, 6);

        System.out.print("6 Add index One : ");
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
    }
}
