public class ToStri {
    public static void main(String[] args) {
        try {
            System.out.println("M1");
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
