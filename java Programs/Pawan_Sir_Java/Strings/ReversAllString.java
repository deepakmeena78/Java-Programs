import java.util.Scanner;

public class ReversAllString {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Word");
        String s = sc.nextLine();

        String x = "";
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                int end = 0;

                if (i == s.length())
                    end = i;
                else
                    end = i - 1;

                while (end >= start) {
                    x += s.charAt(end);
                    end--;
                }
                if (i != s.length() - 1)
                    x += ' ';
                start = i + 1;
            }
        }
        System.out.println(x);
    }
}
