import java.util.*;

public class DurgaSir1 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add(3);
        al.add(4);
        al.add(3);
        al.add(null);
        al.add(false);
        al.add(' ');
        System.out.println(al);
        al.remove(1);
        System.out.println(al);
        al.add(1, 5);
        al.add(9);
        System.out.println(al);

    }
}
