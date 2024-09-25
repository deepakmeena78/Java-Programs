import java.util.Scanner;

public class Practical {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int arr[] = new int[127];
        s = s.replace(" ", "");

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
        }
        int max = -1;
        char ch = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (max < arr[s.charAt(i)]) {
                max = arr[s.charAt(i)];
                ch = s.charAt(i);
            }
        }
        System.out.println(ch);
    }
}
