//5. Write a Java program to insert the specified element at the specified
//   position in the linked list.

import java.util.LinkedList;

public class Assi5 {
    public static void main(String[] args) {

        LinkedList l = new LinkedList<>();
        l.add(3);
        l.add(2);
        l.add(8);
        l.add(6);
        l.add(9);
        System.out.println(l);
        l.set(2, 5);
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
    }
}
