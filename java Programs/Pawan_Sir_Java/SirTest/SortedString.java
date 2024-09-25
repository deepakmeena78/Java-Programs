import java.util.Scanner;

public class SortedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size ");
        int s = sc.nextInt();
        String arr[] = new String[s];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        boolean temp = false;
        boolean temp1 = false;
        char ch3 = ' ',ch4 = ' ';
        for (int i = 0; i < arr.length - 1; i++) {
            String s1 = arr[i];
            String s2 = arr[i + 1];
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if (ch1 > ch2) {
                ch3 = ch2;
            } else if (ch1 < ch2) {
                ch4 = ch1;
            }
        }
        if (temp == true) {
            System.out.println("Big : " + arr[1]);
        } else if (temp1 == true) {
            System.out.println("Big : " + arr[0]);
        }
    }
}
 