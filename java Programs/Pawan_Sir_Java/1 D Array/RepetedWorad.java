import java.util.Scanner;

public class RepetedWorad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array Size :");
        int size = sc.nextInt();

        System.out.println("Enter Array Element");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int targate = size / 2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp++;
                    if (count < temp) {
                        count = temp;
                        if (count >= targate) {
                            System.out.print("Repete : " + count + " Number :" + arr[i]);
                            break;
                        }
                    }
                }
            }
        }
    }
}