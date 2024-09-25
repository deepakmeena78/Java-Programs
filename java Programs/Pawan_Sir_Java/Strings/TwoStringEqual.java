import java.util.Scanner;

public class TwoStringEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Word");
        String s1 = sc.nextLine();

        System.out.println("Enter Second Word");
        String s2 = sc.nextLine();

        int count = 0;
        char a[] = new char[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(j);
                if (ch1 == ch2) {
                    a[i] = ch1;
                }
            }
        }
        if (a.equals(s1)) {
            System.out.println("Same Word Characters");
        } else {
            System.out.println("Defirant Word");
        }

    }
}
