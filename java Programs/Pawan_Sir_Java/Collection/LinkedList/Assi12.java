
//12. Write a Java program to remove a specified element from a linked list.
import java.util.*;

public class Assi12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList l = new LinkedList<>();
        System.out.println("7 Value Enter");
        for (int i = 0; i < 7; i++) {
            String s = sc.next();
            l.add(i, s);
        }
        System.out.println("Obj Value : " + l);
        System.out.println("Enter Remove Value");
        String s1 = sc.next();

        l.remove(s1);

        int temp = 0;
        for (int i = 0; i < 7; i++) {
            if (i < l.size()) {
                System.out.print(l.get(temp) + " ");
                temp++;
            }
        }
    }
}
