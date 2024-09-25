import java.util.Scanner;

public class Palindrom2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name");
        String s = sc.next();

        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            temp = temp + s.charAt(i);
        }
        if (s.equals(temp)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not Palindrom");
        }
    }
}
