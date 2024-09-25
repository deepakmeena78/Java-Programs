
//11. Write a Java program to reverse elements in an array list
import java.util.ArrayList;
import java.util.Collections;

public class AL2_Assi11 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        al.add("Indigo");
        al.add("Yellow");
        System.out.println("ObJ 1 Value : " + al);
        Collections.reverse(al);
        System.out.println("Reverse : " + al);
    }
}
