/*
 * Palindrome Check
Write a program to check if a given string is a palindrome (reads the same backward as forward).

 */

import java.util.Scanner;

public class AS_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Word : ");
        String num = sc.next();

        int j = 0;
        int count = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            char ch1 = num.charAt(j);
            if (ch == ch1) {
            } else {
                count++;
            }
            j++;
        }
        if (count == 0) {
            System.out.println("Palindrome Number : ");
        } else {
            System.out.println("Not Palindrome Number : ");
        }
    }
}
