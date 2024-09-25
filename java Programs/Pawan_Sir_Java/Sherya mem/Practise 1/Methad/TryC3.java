public class TryC3 {
    public static void main(String[] args) {
        try {
            try {
                String s = null;
                s.length();
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Arth");

            } finally {
                try {
                    int b[] = new int[5];
                    b[5] = 4;
                } catch (Exception e) {
                    System.out.println("array Bond");
                }
            }

        } catch (Exception e) {
            System.out.println("Out C");
        }
    }
}
