
//8. Write a Java program to sort a given array list.
import java.util.ArrayList;
import java.util.Collections;

public class AL2_Assi8 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        al.add("Indigo");
        al.add("Yellow");
        System.out.println("ObJ Value : " + al);
        Collections.sort(al);
        System.out.println("Sort List : " + al);
    }
}
