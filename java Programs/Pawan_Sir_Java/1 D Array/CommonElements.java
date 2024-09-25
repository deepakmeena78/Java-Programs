import java.util.Scanner;

public class CommonElements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Arrays Size ");// User Array Size
        int size = sc.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];
        int arr3[] = new int[size];

        System.out.print("Enter Arry 1 ");// Aray1 Declaration
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter Arry 2 ");// Aray2 Declaration
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.print("Enter Arry 3 ");// Aray3 Declaration
        for (int i = 0; i < size; i++) {
            arr3[i] = sc.nextInt();
        }

        int temp[] = new int[10];// Temprery Array
        int temp2[] = new int[size];

        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr2.length - 1; j++) {
                if (arr1[i] == arr2[j]) {
                    temp[i] = arr2[j];
                }
            }
            for (int j = 0; j < arr3.length - 1; j++) {
                if (temp[i] == arr3[j]) {
                    temp2[i] = arr3[j];
                }
            }

        }
        for (int i = 0; i < temp2.length - 1; i++) {
            System.out.print(temp2[i] + " ");
        }
    }
}