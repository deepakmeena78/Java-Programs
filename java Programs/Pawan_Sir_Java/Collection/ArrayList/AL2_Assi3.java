
//3. Write a Java program to insert an element into the array list at the first position.
import java.util.ArrayList;

public class AL2_Assi3 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        System.out.println("Obj : " + al);
        al.add(0, "Ankit");
        System.out.println("0 Index Add : " + al);
        al.set(0, "Meena");
        System.out.println("0 Index Set : " + al);
    }
}
