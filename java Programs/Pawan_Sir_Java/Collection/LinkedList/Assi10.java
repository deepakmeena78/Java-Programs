
//10. Write a Java program to get the first and last occurrence of the specified
//elements in a linked list.
import java.util.*;

public class Assi10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList l = new LinkedList<>();
        System.out.println("10 Vlue Input :");
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            l.add(i, n);
        }

        System.out.println("Obj Vlues : " + l);
        System.out.println("First : " + l.getFirst());
        System.out.println("Last : " + l.getLast());
    }
}
