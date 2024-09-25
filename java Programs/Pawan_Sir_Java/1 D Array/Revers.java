// import java.util.Scanner;

// public class Revers {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int num[] = new int[5];
//         for (int i = 0; i < num.length; i++) {
//             System.out.println("Enter Number");
//             num[i] = sc.nextInt();
//         }

//         int first = 0, last = num.length - 1;
//         while (first < last) {
//             int tem = num[last];
//             last = num[first];
//             first = tem;
//             first++;
//             last--;
//         }
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i]);
//         }
//         System.out.println();
//     }
// }

import java.util.Scanner;

public class Revers {
    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
