
/* Modify an ArrayList
Objective: Develop a program to perform operations on an ArrayList.
Tasks:
Add 5 integers to an ArrayList.
Replace the second element with a new integer.
Remove the third element.
Display the updated ArrayList.
 */
import java.util.*;
import java.util.ArrayList;

public class A_ModifyArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList();
        System.out.println("Enter 5 Numbers : ");
        for (int i = 0; i < 5; i++) {
            al.add(sc.nextInt());
        }

        System.out.println(al);
        int a = al.get(1);
        al.remove(2);
        al.remove(1);
        int b = a * a;
        al.add(1, b);
        System.out.println(al);
    }
}
