import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Words");
        String s = sc.nextLine();

        s = s.replace(" ", "");
        s = s.toLowerCase();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == 'a' || temp == 'e' || temp == 'u' || temp == 'o' || temp == 'i') {
                count++;
            }
        }
        System.out.println("Vowel " + count);
    }
}
