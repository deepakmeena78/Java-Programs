
//5. Write a Java program to update an array element by the given element.
import java.util.ArrayList;

public class AL2_Assi5 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        al.add("Indigo");
        al.add("Yellow");
        System.out.println("Obj Value : " + al);
        al.set(2, "Orange");
        System.out.println("Obj Update : " + al);

    }
}
