public class A4Assi2 {
    public static void main(String[] args) {
        String arr[] = { "A", "B", "C", "D", "E" };
        String arr2[] = { "java", "A", "Q", "T", "B" };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    System.out.println(arr2[j]);
                }
            }
        }
    }
}
