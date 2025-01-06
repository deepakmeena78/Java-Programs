/*Count Vowels and Consonants
Write a program to count the number of vowels and consonants in a string.

Example Input: hello world
Example Output: Vowels: 3, Consonants: 7
 */

import java.util.Scanner;

public class AS_CountVowels_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Content : ");
        String str = sc.nextLine().toUpperCase();

        int vowel = 0;
        int Consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowel++;
            } else if ((ch >= 'A' && ch <= 'Z') && (ch != 'A' || ch != 'E' || ch != 'I' || ch != 'O' || ch != 'U')) {
                Consonants++;
            }
        }
        System.out.println("Vowels : " + vowel);
        System.out.println("Consonants : " + Consonants);
    }
}
