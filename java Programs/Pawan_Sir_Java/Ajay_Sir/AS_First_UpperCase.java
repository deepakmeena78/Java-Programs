//6. WAP to convert First character of every word into upper case.

import java.util.Scanner;

public class AS_First_UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Content");
        String s = sc.nextLine().toLowerCase();
        String update = "";

        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            char ch3 = s.charAt(i + 1);
            if (ch == ' ') {
                int a = ch3;
                a = a - 32;
                char ch2 = (char) a;
                update = update + ch2;
            } else {
                update = update + ch3;
            }
        }
        System.out.println(update);
    }
}
