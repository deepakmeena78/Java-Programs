import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = { 1, 2, 3, 4, 5, 6, };
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = 0; j < a.length; j++) {
                // if (i == a.length / 2) {
                    int temp = a[i];
                    a[i] = a[a.length - i];
                    a[a.length - i] = temp;
                // }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}