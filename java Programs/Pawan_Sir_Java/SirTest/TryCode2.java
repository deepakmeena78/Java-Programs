public class TryCode2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 5, 2 };

        int temp = arr.length / 2;
        int temp2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {///////wrong///////
                if (arr[i] == arr[j]) {
                    temp2++;
                    if (temp2 == temp) {
                        System.out.println(arr[j] + " ");
                        break;
                    }
                }
            }
            temp2 = 0;
        }
    }
}
