//6. Write a Java program to insert elements into the linked list at the first and
//   last positions.

import java.util.LinkedList;

public class Assi6 {
    public static void main(String[] args) {

        LinkedList l = new LinkedList<>();
        l.add(3);
        l.add(2);
        l.add(8);
        l.add(6);
        l.add(9);
        System.out.println(l);
        l.addFirst("F");
        l.addLast("L");

        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
    }
}
