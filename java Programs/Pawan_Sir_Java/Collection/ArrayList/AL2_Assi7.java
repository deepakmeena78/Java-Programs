
//7. Write a Java program to search for an element in an array list.
import java.util.ArrayList;
import java.util.List;

public class AL2_Assi7 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        al.add("Indigo");
        al.add("Yellow");

        System.out.println("Obj Value : " + al);
        System.out.println("Search Green : " + al.contains("Green"));
        System.out.println("Search Red : " + al.contains("Red"));
    }
}
