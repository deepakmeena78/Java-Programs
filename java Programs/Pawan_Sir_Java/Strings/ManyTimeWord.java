import java.util.Scanner;

public class ManyTimeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Content :");
        String s = sc.nextLine().toLowerCase().replace(" ", "");
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }

        int count = 0;
        char ch1 = ' ';
        for (int i = 0; i < ch.length; i++) {
            int temp = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    temp++;
                    if (count < temp) {
                        ch1 = ch[i];
                        count = temp;
                    }
                }
            }
        }
        System.out.println(count + " : " + ch1);
    }
}