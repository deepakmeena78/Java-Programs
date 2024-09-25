
//17. Write a Java program to empty an array list.
import java.util.ArrayList;

public class AL2_Assi17 {
    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Red");
        a1.add("Blue");
        a1.add("Green");
        a1.add("Indigo");
        a1.add("Yellow");
        System.out.println("Obj 1 Value : " + a1);
        a1.clear();
        System.out.println("Empty : " + a1);
        System.out.println("Emoty Method : " + a1.isEmpty());

    }

}
