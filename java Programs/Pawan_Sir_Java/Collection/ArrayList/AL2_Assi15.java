
//15. Write a Java program to join two array lists
import java.util.ArrayList;

public class AL2_Assi15 {
    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Red");
        a1.add("Blue");
        a1.add("Green");
        a1.add("Indigo");
        a1.add("Yellow");
        System.out.println("Obj 1 Value : " + a1);

        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("Ankit");
        a2.add("Meena");
        a2.add("Deepak");
        a2.add("Infobeans");
        a2.add("Faundation");
        System.out.println("Obj 2 Value : " + a2);

        ArrayList<String> a3 = new ArrayList<String>();
        a3.addAll(a1);
        a3.addAll(a2);
        System.out.println("OBJ1 + OBJ2 = : " + a3);
    }
}
