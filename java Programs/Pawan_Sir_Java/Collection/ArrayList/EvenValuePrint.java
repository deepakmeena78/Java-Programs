//2. WAP to store integer values in arraylist and display only those values which are even.

import java.util.ArrayList;
import java.util.ListIterator;

public class EvenValuePrint {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(2);
        al.add(5);
        al.add(6);
        al.add(8);
        al.add(9);

        ListIterator it = al.listIterator();
        while (it.hasNext()) {
            int i = ((Integer) it.next());
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}