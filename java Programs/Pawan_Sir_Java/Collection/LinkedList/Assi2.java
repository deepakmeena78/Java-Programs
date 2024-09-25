//2. Write a Java program to iterate through all elements in a linked list.
import java.util.LinkedList;

public class Assi2 {
    public static void main(String arhs[]) {
        LinkedList ls = new LinkedList<>();
        ls.add(3);
        ls.add(2);
        ls.add(8);
        ls.add(6);
        ls.add(9);
        for (int i = 0; i < 5; i++) {
            System.out.print(ls.get(i) + " ");
        }
    }
}
