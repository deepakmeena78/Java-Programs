import java.util.Scanner;

public class StringQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Word");
        String s1 = sc.next();

        System.out.println("Enter Second Word ");
        String s2 = sc.next();

        int count = 0;
        int temp = 0;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s1.length(); j++) {
                    char ch1 = s1.charAt(i);
                    char ch2 = s2.charAt(j);
                    if (ch1 == ch2) {
                        count++;
                        if (count == s1.length()) {
                            temp++;
                            System.out.println("Anagrams Word");
                        }
                    }
                }
            }

        } else {
            System.out.println("Word Not Anagrams");
        }
        if (temp == 0) {
            System.out.println("Word Not Anagrams");
        }
    }
}
