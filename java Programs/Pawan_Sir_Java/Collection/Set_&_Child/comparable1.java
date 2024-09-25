import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class comparable1 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList();
        al.add(3);
        al.add(5);
        al.add(2);
        al.add(9);
        al.add(6);
        al.add(1);
        al.add(7);
        ;

        for (int x : al) {
            System.out.print(x + " ");
        }

        Collections.sort(al);
        System.out.println();

        for (int x : al) {
            System.out.print(x + " ");
        }
    }
}