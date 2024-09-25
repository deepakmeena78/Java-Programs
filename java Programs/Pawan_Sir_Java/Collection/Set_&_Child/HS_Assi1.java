
//1.Write a Java program to append the specified element to the end of a hash
//  set
import java.util.*;

public class HS_Assi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet hs = new HashSet<>();

        System.out.println("Enter 6 Value :");
        for (int i = 0; i < 6; i++) {
            String s = sc.next();
            hs.add(s);
        }
        System.out.println("Obj Value : " + hs);
    }
}
