public class Join1 extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + "  Run Method");
            }
        } catch (Exception a) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        try {
            Join1 joi = new Join1();
            joi.start();
            joi.join();

            Join1 joi1 = new Join1();
            joi1.start();
            joi1.start();

        } catch (Exception q) {
            System.out.println(q);
        }
    }
}
