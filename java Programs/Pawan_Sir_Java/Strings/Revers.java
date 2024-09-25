import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name");
        String s = sc.next();

        String revers = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            revers = revers + s.charAt(i);
        }
        System.out.println(revers);
    }
}
