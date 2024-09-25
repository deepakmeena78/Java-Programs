//11. Write a Java program to display elements and their positions in a linked
//    list.

import java.util.*;

public class Assi11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList l = new LinkedList<>();
        System.out.println("Enter 10 String : ");
        for (int i = 0; i < 10; i++) {
            String s = sc.next();
            l.add(i, s);
        }
        System.out.println("Obj Value : " + l);
        System.out.print("With Index Value :");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " " + l.get(i) + " : ");
        }
    }
}
