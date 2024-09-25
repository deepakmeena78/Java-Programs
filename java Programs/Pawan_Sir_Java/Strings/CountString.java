import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter NUmber ");
        String s = sc.nextLine();
        s = s.replace(" ", "");

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        System.out.println(count + " Digit");
    }
}
