
//6. Write a Java program to remove the third element from an array list.
import java.util.ArrayList;

public class AL2_Assi6 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        al.add("Indigo");
        al.add("Yellow");
        System.out.println("Obj Value : " + al);
        al.remove(2);
        System.out.println("Index 2 Remove : " + al);
    }
}
