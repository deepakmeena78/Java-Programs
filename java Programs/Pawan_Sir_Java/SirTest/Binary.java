// import java.util.Scanner;

// public class Binary {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Number : ");
//         int n = sc.nextInt();

//         int i = 1;
//         int binary = 0;
//         while (n != 0) {
//             binary = binary + i * (n % 2);
//             n = n / 2;
//             i = i * 10;
//         }
//         System.out.println(binary);
//         sc.close();
//     }
// }
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        int binary = 1;
        while (n != 0) {
            binary = (n % 2) + binary * 10;
            n = n / 2;
        }
        binary = binary / 10;
        System.out.println(binary);
    }
}