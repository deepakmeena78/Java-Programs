public class A4Assi1 {
    public static void main(String[] args) {
        int arr[] = { 5, 0, 9, -1, 3, 2 };
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] == 0 || arr[i] == -1) && (arr[i + 1] == 0 || arr[i + 1] == -1)) {
                System.out.println("True Value");
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("False Value");
        }
    }
}
