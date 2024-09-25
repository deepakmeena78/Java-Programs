//1. Write a Java program to append the specified element to the end of a linked
//   list.
import java.util.LinkedList;

public class Assi1{
    public static void main(String args []){

        LinkedList ll = new LinkedList<>();
        ll.add(4);
        ll.add(5);
        ll.add(2);
        ll.add(8);
        ll.addLast(7);
        System.out.println(ll);
    }
}