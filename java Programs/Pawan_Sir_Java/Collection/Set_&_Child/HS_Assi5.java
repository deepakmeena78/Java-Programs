
//5. Write a Java program to test if a hash set is empty or not
import java.util.*;

public class HS_Assi5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet hs = new HashSet<>();
        System.out.println("Enter 6 Value :");
        for (int i = 0; i < 6; i++) {
            String s = sc.next();
            hs.add(s);
        }
        System.out.println("Obj Values : " + hs);
        System.out.println("Empty Not: " + hs.isEmpty());
        System.out.print("Remove Elements : \n");
        hs.clear();
        System.out.println("Empty : " + hs.isEmpty());
    }
}
