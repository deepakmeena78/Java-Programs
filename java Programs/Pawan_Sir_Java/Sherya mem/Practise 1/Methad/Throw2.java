public class Throw2 {

    public static int m1() {
        try {
            System.out.println("hello");
            return 1;
        } catch (Exception e) {

        } finally {
            System.out.println("finaly");
        }
        return 2;

    }

    public static void main(String[] args) {
        int a = m1();
        System.out.println(a);
    }
}
