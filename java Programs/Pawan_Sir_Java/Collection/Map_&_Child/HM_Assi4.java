
//4. Write a Java program to remove all mappings from a map
import java.util.*;

public class HM_Assi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap hm = new HashMap<>();
        hm.put(0, "A");
        hm.put(1, "B");
        hm.put(2, "C");
        hm.put(3, "D");
        hm.put(4, "E");

        System.out.println("Obj " + hm);
        for (int i = 0; i <= 4; i++) {
            hm.remove(i);
        }
        System.out.println("Remove Keys : " + hm);
    }
}
