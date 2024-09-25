
//18. Write a Java program to test whether an array list is empty or not
import java.util.ArrayList;

public class AL2_Assi18 {
    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Red");
        a1.add("Blue");
        a1.add("Green");
        a1.add("Indigo");
        a1.add("Yellow");
        System.out.println("Obj 1 Value : " + a1);
        System.out.println("Empty Method : " + a1.isEmpty());
        a1.clear();
        System.out.println("Remove Element : " + a1);
        System.out.println("Empty Method : " + a1.isEmpty());
    }
}
