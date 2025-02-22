import java.util.Scanner;

public class BigLength1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Word");
        String s = sc.nextLine();

        int start = 0;
        int n = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                int count = 0;
                int end = 0;

                if (i == s.length() - 1)
                    end = i;
                else
                    end = i - 1;
                while (end >= start) {
                    n++;
                    end--;
                }
                char temp = s.charAt(n);
                n++;
                start = i + 1;
                System.out.print(count+" ");
            }
        }
    }
}
