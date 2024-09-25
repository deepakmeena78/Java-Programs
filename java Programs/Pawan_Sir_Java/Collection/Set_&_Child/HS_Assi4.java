
//4. Write a Java program to empty an hash set.
import java.util.*;

public class HS_Assi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet hs = new HashSet<>();
        System.out.println("Enter 6 Value :");
        for (int i = 0; i < 6; i++) {
            String s = sc.next();
            hs.add(s);
        }
        System.out.println("Obj Value : " + hs);
        System.out.println(hs.isEmpty());
        hs.clear();
        System.out.println("Remove Element :" + hs);
        System.out.println(hs.isEmpty());
    }
}
