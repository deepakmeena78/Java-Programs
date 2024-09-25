import java.util.Scanner;

public class FirstLetterVowel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Words");
        String s = sc.nextLine();
        var c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) == ' ') {
                char ch = s.charAt(i == 0 ? i : i + 1);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    c++;
                }
            }
        }
        System.out.println("Count " + c);
    }
}