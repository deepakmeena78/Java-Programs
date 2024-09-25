
//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
import java.util.ArrayList;

public class AL2_Assi4 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        System.out.println("Obj : " + al);
        System.out.println("Get 1 Index : " + al.get(1));
        System.out.println("Get 3 Index : " + al.get(3));
    }
}
