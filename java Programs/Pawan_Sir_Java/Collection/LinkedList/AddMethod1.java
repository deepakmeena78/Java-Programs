import java.util.*;

public class AddMethod1 {
    public static void main(String[] args) {

        LinkedList i = new LinkedList();
        i.add(6);
        i.add(2);
        i.add(6);
        i.add(0);
        i.add(5);
        i.add(7);
        i.add(4);//Wrong Number
        i.add(6);
        i.add(0);
        i.add(4);
        i.add(0);
        i.remove(6);//remove Wrong Number
        System.out.println(i);
    }
}