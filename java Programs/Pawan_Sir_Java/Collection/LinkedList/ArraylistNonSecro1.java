import java.util.*;

public class ArraylistNonSecro1 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add(2);
        al.add(3);
        al.add(1);
        al.add(5);
        System.out.println(al);
        List l = Collections.synchronizedList(al);
        l.add(5);
        l.add(7);
        System.out.println(l);

    }
}