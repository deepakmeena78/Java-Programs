import java.util.*;

public class HM_Method2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        HashMap hm = new HashMap();
        System.out.println("Enter Element :");
        for (int i = 0; i < 5; i++) {
            String s = sc.next();
            hm.put(i, s);
        }

        System.out.println("Obj Print :> " + hm);

        Set s = hm.entrySet();
        Iterator ii = s.iterator();

        System.out.print(" Iterator Method :> ");
        while (ii.hasNext()) {
            System.out.print(ii.next() + " ");
        }
    }
}
