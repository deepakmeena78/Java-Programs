import java.util.Scanner;

public class ArrayFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array Element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 0, temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp++;
                    if(count > temp){
                        
                    }
                }
            }
        }

    }

}
