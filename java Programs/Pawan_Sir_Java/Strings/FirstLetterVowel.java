import java.util.Scanner;

public class FirstLetterVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number Or Word");
        String s = sc.nextLine();
        s = s.toLowerCase();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i == 0 || ch == ' ') {
                char ch2 = s.charAt(i + 1);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch2 == 'a' || ch2 == 'e'
                        || ch2 == 'i' || ch2 == 'o' || ch2 == 'u') {
                    count++;
                }
            }
        }
        System.out.println("First Latter Vowel " + count);
    }
}