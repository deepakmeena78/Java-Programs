import java.util.*;

public class HM_Many_1 {
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
        System.out.print("Entry Methos :> ");
        while (ii.hasNext()) {
            Map.Entry entry = (Map.Entry) ii.next();
            System.out.print(entry.getKey() + "  " + entry.getValue() + " : ");
        }

        System.out.println();
        Iterator ii1 = s.iterator();
        System.out.print(" Iterator Method :> ");
        while (ii1.hasNext()) {
            System.out.print(ii1.next() + " ");
        }

        System.out.println();
        System.out.print(" Get Method :> ");
        for (int i = 0; i < hm.size(); i++) {
            System.out.print(hm.get(i) + " , ");
        }

    }
}