//3. Write a Java program to iterate through all elements in a linked list starting
//at the specified position.

import java.util.LinkedList;

public class Assi3 {
    public static void main(String[] args) {

        LinkedList ls = new LinkedList<>();
        ls.add(3);
        ls.add(2);
        ls.add(8);
        ls.add(6);
        ls.add(9);
        System.out.println(ls);
        for (int i = 0; i < ls.size(); i++) {
            if (i >= ls.size() / 2) {
                System.out.print(ls.get(i) + " ");
            }
        }
    }
}
