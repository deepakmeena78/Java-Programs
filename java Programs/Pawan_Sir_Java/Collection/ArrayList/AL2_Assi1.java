
//1. Write a Java program to create an array list, add some colors (strings) and print out the collection
import java.util.ArrayList;

public class AL2_Assi1 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("Red");
        al.add("Orange");
        al.add("Yellow");
        al.add("Green");
        al.add("Blue");
        al.add("Indigo");
        al.add("Violet");

        System.out.println("Obj Vlues : " + al);
        System.out.print("Get : ");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " , ");
        }
    }
}
