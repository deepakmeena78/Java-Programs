public class Error {
    public static void main(String[] args) {
        try {
            int z = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("reat of your code");
        }
    }
}