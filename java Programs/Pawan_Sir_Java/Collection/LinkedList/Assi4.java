//4. Write a Java program to iterate a linked list in reverse order.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Assi4 {
    public static void main(String[] args) {

        LinkedList li = new LinkedList<>();
        li.add(3);
        li.add(2);
        li.add(8);
        li.add(6);
        li.add(9);

        for (int i = li.size() - 1; i >= 0; i--) {
            System.out.print(li.get(i) + " ");
        }
    }
}