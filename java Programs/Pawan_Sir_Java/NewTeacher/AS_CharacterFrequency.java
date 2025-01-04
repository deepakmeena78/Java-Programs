/*Character Frequency
Write a program to find the frequency of each character in a string.
Example Input: hello
Example Output: {h=1, e=1, l=2, o=1}
 */

import java.util.Scanner;

public class AS_CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  Content : ");
        String s = sc.nextLine().replace(" ", "");

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char chi = s.charAt(i);
            if (chi != '#') {
                for (int j = 0; j < s.length(); j++) {
                    char chj = s.charAt(j);
                    if (chi == chj) {
                        count++;
                    }
                }
                s = s.replace(chi, '#');
                System.out.print(chi + " : " + count + " , ");
                count = 0;
            }
        }
    }
}
