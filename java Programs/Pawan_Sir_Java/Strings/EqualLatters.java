import java.util.Scanner;

public class EqualLatters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Words");
        String s1 = sc.next();
        System.out.println("Enter 2st Words");
        String s2 = sc.next();

        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            count++;
        }

        int count2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            for (int j = 0; j < s2.length(); j++) {
                char ch2 = s2.charAt(j);
                if (ch1 == ch2) {
                    count2++;
                }
            }
        }
        if (count == count2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
