/*String Reversal
Write a program to reverse a given string.
Example Input: Java
Example Output: avaJ
Remove Whitespace */

import java.util.Scanner;

public class AS_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Word : ");
        String str = sc.next();

        String update = "";
        for (int i = 0; i < str.length(); i++) {
            update = str.charAt(i) + update;
        }
        System.out.println(update);
    }
}
