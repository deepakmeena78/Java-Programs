//Q2.Write a Java program to test two arrays' equality.
public class ArrayEquality {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        //int arr2[] = { 8, 7, 6, 5, 4, 3, 2, 1 };
        int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr2[i]) {
                count++;
            }
        }

        if (count == arr.length) {
            System.out.println("Array Equality");
        }

        if (arr.equals(arr2)) {
            System.out.println("Ankit Meena");
        }
    }
}