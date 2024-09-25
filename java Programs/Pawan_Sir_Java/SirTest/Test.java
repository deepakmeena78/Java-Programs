public class Test {
    public static void main(String args[]) {

        int arr[] = { 16, 17, 4, 3, 5, 2 };
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j] || i == arr.length) {
                    temp = arr[i];
                }
            }
            System.out.println(" Greater " + temp);
            temp = 0;
        }
    }
}