// 6.Write a program to check string contains special characters($, @, #) or not..

import java.util.Scanner;

public class AS_specialCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Content : ");
        String s = sc.nextLine();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '$' || ch == '@' || ch == '#') {
                System.out.println("Index : " + i + " : Special Character : " + ch);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No Special Characters");
        }
    }
}
