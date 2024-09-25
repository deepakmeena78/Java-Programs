import java.util.*;

public class HM_Method3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap hm = new HashMap();
        System.out.println("Enter Element :");
        for (int i = 0; i < 5; i++) {
            String s = sc.next();
            hm.put(i, s);
        }

        System.out.println("Obj Print :> " + hm);

        System.out.print(" Get Method :> ");
        for (int i = 0; i < hm.size(); i++) {
            System.out.print(hm.get(i) + " , ");
        }
    }
}