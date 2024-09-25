
//Q1Write a Java program to convert an array to an ArrayList.
import java.util.*;

public class ArrayToArrayList {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        ArrayList al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(i, arr[i]);
        }
        System.out.println(al);
    }
}