
//13. Write a Java program to compare two array lists.
import java.util.ArrayList;

public class AL2_Assi13 {
    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<String>();
        ArrayList<String> a2 = new ArrayList<String>();
        a1.add("Red");
        a1.add("Blue");
        a1.add("Green");
        a1.add("Indigo");
        a1.add("Yellow");
        System.out.println("ObJ 1 Value : " + a1);

        a2.add("Red");
        a2.add("Green");
        a2.add("Yellow");
        a2.add("Ankit");
        a2.add("Meena");
        System.out.println("ObJ 2 Value : " + a2);

        ArrayList<String> a3 = new ArrayList<String>();
        for (String s : a1)
            a3.add(a2.contains(s) ? "Yes" : "No");
        System.out.println(a3);
    }
}
