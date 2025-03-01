import java.util.ArrayList;
import java.util.Collections;

public class SortingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(5);
        ar.add(2);
        ar.add(6);
        ar.add(1);
        ar.add(7);

        Collections.sort(ar, (o1, o2) -> {
            if (o1 < o2) {
                return +1;
            } else if (o1 > o2) {
                return -1;
            }
            return 0;
        });
        System.out.println("Sorted List (Descending Order): " + ar);
    }
}
