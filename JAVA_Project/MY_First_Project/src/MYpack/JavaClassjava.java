
public class JavaClassjava {

    public static void main(String[] args) {

        int arr[] = {2, 3, 6, 1, 9};
        int temp = sum(arr);
        System.out.println(temp);
    }

    public static int sum(int arr[]) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a = a + arr[i];
        }
        return a;
    }
}
