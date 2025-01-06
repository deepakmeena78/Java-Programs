//5. WAP to read strin from user and count how many spaces available in that string.

import java.util.Scanner;

public class AS_countSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Content");
        String s = sc.nextLine();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }
        System.out.println("Spaces : " + count);
    }
}
