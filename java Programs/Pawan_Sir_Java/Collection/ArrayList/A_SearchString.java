/*Search in an ArrayList
Objective: Write a program to search for an element in an ArrayList.

Tasks:

Allow the user to enter multiple strings into an ArrayList.
Prompt the user to enter a string to search for.
Check if the string exists in the list and display its position(s). */

import java.util.Scanner;
import java.util.ArrayList;

public class A_SearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Enter Number : 5 ");
        for (int i = 0; i < 5; i++) {
            al.add(sc.next());
        }

        System.out.println("Enter Find String : ");
        String check = sc.next();

        boolean flag = false;
        for (String x : al) {
            if (x.equals(check)) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Exist This Value");
        } else {
            System.out.println("Does Not Exist This Value");
        }
    }
}