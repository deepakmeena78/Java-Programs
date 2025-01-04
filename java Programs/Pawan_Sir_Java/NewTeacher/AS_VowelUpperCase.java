//5. WAP to read a string from user and convert all the vovels into upper case.

import java.util.Scanner;

public class AS_VowelUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Content : ");
        String s = sc.nextLine().toLowerCase();
        String update = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
                int a = ch;
                a = a - 32;
                char ch2 = (char) a;
                update = update + ch2;
            } else {
                update = update + ch;
            }
        }
        System.out.println("New String : " + update);
    }
}
