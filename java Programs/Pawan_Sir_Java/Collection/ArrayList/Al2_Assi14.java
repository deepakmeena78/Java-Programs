
//14. Write a Java program that swaps two elements in an array list.
import java.util.ArrayList;
import java.util.Collections;

public class Al2_Assi14 {
    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Red");
        a1.add("Blue");
        a1.add("Green");
        a1.add("Indigo");
        a1.add("Yellow");

        System.out.print("Obj 1 Value :=> ");
        for (String s : a1) {
            System.out.print(s + ", ");
        }

        System.out.println();
        Collections.swap(a1, 1, 3);

        System.out.print("Swap :=> ");
        for (String s : a1) {
            System.out.print(s + ", ");
        }

    }
}
