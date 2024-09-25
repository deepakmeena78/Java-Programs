import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {

        ArrayList a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("r");
        a.add("g");
        int i = Collections.binarySearch(a, "r");
        System.out.println(i);
    }
}