package SimplePrograms;
import java.util.Scanner;

public class CountString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[5];
        System.out.println("Enter Name");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().toLowerCase();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i].charAt(0);
            if (ch == 'a' || ch == 'p') {
                System.out.println("A,P Start Word : " + arr[i]);
                sum++;
            }
        }
        System.out.println("Total Word : " + sum);
    }
}
