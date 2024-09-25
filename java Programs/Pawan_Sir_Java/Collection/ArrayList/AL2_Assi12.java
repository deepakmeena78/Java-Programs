
//12. Write a Java program to extract a portion of an array list.
import java.util.ArrayList;
import java.util.List;

public class AL2_Assi12 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        al.add("Indigo");
        al.add("Yellow");
        System.out.println("ObJ 1 Value : " + al);
        List l = al.subList(0, 3);
        System.out.println("0 To 2 Index : " + l);
    }
}
