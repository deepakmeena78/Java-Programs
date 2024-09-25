
//9. Write a Java program to copy one array list into another.
import java.util.ArrayList;

public class AL2_Assi9 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        ArrayList al2 = new ArrayList<>();
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        al.add("Indigo");
        al.add("Yellow");
        System.out.println("ObJ 1 Value : " + al);
        al2.add(0, "A");
        System.out.println("Obj 2 : " + al2);
        al2.addAll(al);
        System.out.println("ObJ 2 Value : " + al);

    }
}
