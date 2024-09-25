import java.util.Scanner;

class TwoSortedArray2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First Array Size :");
        int first = sc.nextInt();
        System.out.println("Second Array Size :");
        int second = sc.nextInt();

        int arr1[] = new int[first];
        int arr2[] = new int[second];
        int temp[] = new int[first + second];

        System.out.println("First Array Element :");
        for (int i = 0; i < first; i++) {// value Array Store
            arr1[i] = sc.nextInt();
        }
        System.out.println("Second Array Element :");
        for (int i = 0; i < second; i++) {// value Array Store
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    arr1[j] = -1;
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

        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                temp[j] = arr1[i];
                j++;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != -1) {
                temp[j] = arr2[i];
                j++;
            }
        }

        for (int i = 0; i < temp.length - 1; i++) {
            System.out.print(" " + temp[i]);
        }
    }
}