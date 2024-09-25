// import java.util.Scanner;

// public class OneTo10Di {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         for (int i = 1; i <= 5000; i++) {
//             if (i % 1 == 0) {
//                 if (i % 2 == 0) {
//                     if (i % 3 == 0) {
//                         if (i % 4 == 0) {
//                             if (i % 5 == 0) {
//                                 if (i % 6 == 0) {
//                                     if (i % 7 == 0) {
//                                         if (i % 8 == 0) {
//                                             if (i % 9 == 0) {
//                                                 if (i % 10 == 0) {
//                                                     System.out.println(i);
//                                                 }
//                                             }
//                                         }
//                                     }
//                                 }
//                             }
//                         }
//                     }
//                 }
//             }
//         }
//     }
// }

import java.util.Scanner;

public class Mohan {
    public static void main(String[] args) {

        int i = 2;
        // while (true) {
        // if (i % 2 == 0 && i % 3 == 0 && i % 4 == 0 && i % 5 == 0 && i % 6 == 0 && i %
        // 7 == 0 && i % 8 == 0
        // && i % 9 == 0 && i % 10 == 0) {
        // System.out.println(i);
        // break;
        // }
        // i++;
        // }

        // for (;;) {
        // if (i % 2 == 0 && i % 3 == 0 && i % 4 == 0 && i % 5 == 0 && i % 6 == 0 && i %
        // 7 == 0 && i % 8 == 0
        // && i % 9 == 0 && i % 10 == 0) {
        // System.out.println(i);
        // break;
        // }
        // i++;
        // }
        do {
            if (i % 2 == 0 && i % 3 == 0 && i % 4 == 0 && i % 5 == 0 && i % 6 == 0 && i %
                    7 == 0 && i % 8 == 0
                    && i % 9 == 0 && i % 10 == 0) {
                System.out.println(i);
                break;
            }
            i++;
            System.out.println("jsbdjsa");
        } while (false);

    }
}