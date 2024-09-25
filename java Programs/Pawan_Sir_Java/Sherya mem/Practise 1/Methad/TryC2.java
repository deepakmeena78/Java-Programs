public class TryC2 {
    public static void main(String[] args) {
        int a = 0;

        try {
            int b = 10 / a;

            try {
                if (a > 1) {
                }

            } catch (ArithmeticException e) {
                System.out.println("Wrong");
                // TODO: handle exception
            }
        } catch (Exception e) {
            System.out.println("Wrong 2");
            // TODO: handle exception
        }
    }
}
