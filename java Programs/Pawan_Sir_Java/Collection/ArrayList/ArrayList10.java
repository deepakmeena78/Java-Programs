import java.util.ArrayList;

public class ArrayList10 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(3);
        al.add(1);
        al.add(4);
        al.add(0);
        al.add(7);
        al.set(0, 6);
        al.get(2);
        System.out.println(al.get(4));
        System.out.println(al);
    }
}
