import java.util.Scanner;

public class CompaireString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Strings");
        String arr[] = new String[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        String l = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (l.compareTo(arr[i]) < 0) {
                l = arr[i];
            }
        }
        System.out.println(l);
    }
}
