import java.util.Scanner;

public class TwoSortedArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Array Size ");
        // int size = sc.nextInt();
        // int arr[] = new int[size];

        // System.out.println("Enter First Array Element");//First Array Declartion
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 1, 2, 3, 4, 7 };

        // int temp[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                }
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] == arr2[j]) {
                    arr2[j] = -1;
                }
            }
        }

        // for (int i = 0; i < temp.length; i++) {
            
        // }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr2.length; j++) {
                if (arr[i] != arr2[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
        // int k = 0;
        // for (int i = 0; i < temp.length; i++) {
        //         if (arr[i] == arr2[j]) {
        //             temp[k] = arr[];
        //         }
        //     }
        // }

    //     for (int i = 0; i < arr.length-1; i++) {
    //             System.out.print(arr[i]);
    //         }
    //     }
    // }
}}
