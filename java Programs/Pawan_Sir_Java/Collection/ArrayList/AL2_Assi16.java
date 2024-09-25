
//16. Write a Java program to clone an array list to another array list.
import java.util.ArrayList;

public class AL2_Assi16 {
    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Red");
        a1.add("Blue");
        a1.add("Green");
        a1.add("Indigo");
        a1.add("Yellow");
        System.out.println("Obj 1 Value : " + a1);

        ArrayList<String> a2 = (ArrayList<String>) (a1.clone());
        System.out.println("Obj 2 Clone Value : " + a2);
    }
}
