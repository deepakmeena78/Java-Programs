import java.util.Scanner;;

public class Pattern94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value");
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
