//6. WAP to convert First character of every word into upper case.

import java.util.Scanner;

public class AS_First_UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Content");
        String s = sc.nextLine().toLowerCase();
        String update = "";

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i - 1);
            char ch3 = s.charAt(i);
            if (ch == ' ' || i == 1) {
                int a = ch3;
                a = a - 32;
                char ch2 = (char) a;
                update = update + ch2;
            }
        }
        System.out.println(update);
    }
}
