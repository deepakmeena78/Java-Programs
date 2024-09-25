public class Interrupt extends Thread {

    // public void run() {
    // try {
    // for (int i = 1; i <= 5; i++) {
    // System.out.println(i);
    // Thread.sleep(1000);
    // }
    // } catch (Exception a) {
    // System.out.println(a);
    // }

    public static void main(String[] args) {

        Interrupt in = new Interrupt();
        in.start();
        in.interrupt();
    }
}
