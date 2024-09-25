
//10) WAP to count the word whose first letter is  vowel.
import java.util.Scanner;

public class VowelFirstLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Content");
        String s = sc.nextLine().toLowerCase();

        int count = 0;
        char temp2 = s.charAt(0);
        if (temp2 == 'a' || temp2 == 'e' || temp2 == 'u' || temp2 == 'o' || temp2 == 'i') {
            count++;
        }
        for (int i = 1; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                char ch1 = s.charAt(i + 1);
                if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}