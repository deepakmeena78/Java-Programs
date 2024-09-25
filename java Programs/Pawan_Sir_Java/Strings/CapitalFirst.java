import java.util.Scanner;

public class CapitalFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Word");
        String a = sc.nextLine();

        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(a.charAt(0));
        sb.append(ch);
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == ' ' && i < a.length() - 1) {
                sb.append(a.charAt(i));
                i++;
                sb.append(Character.toUpperCase(a.charAt(i)));
            } else {
                sb.append(a.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
