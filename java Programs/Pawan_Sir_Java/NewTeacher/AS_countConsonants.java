//4. Write a program to count number of consonants in given string..read string from user.

import java.util.Scanner;

public class AS_countConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Content : ");
        String s = sc.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch > 'a' && ch <= 'z') && (ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u')) {
                count++;
            }
        }
        System.out.println("Total Consonants : " + count);
    }
}
