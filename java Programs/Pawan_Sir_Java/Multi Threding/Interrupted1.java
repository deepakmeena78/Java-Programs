public class Interrupted1 extends Thread {

    public void run() {
        try {

            System.out.println(Thread.interrupted());
            System.out.println(Thread.currentThread().isInterrupted());

            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
                System.out.println(Thread.interrupted());
                System.out.println(Thread.currentThread().isInterrupted());
            }
        } catch (Exception a) {
            System.out.println(a);
        }
    }

    public static void main(String args[]) {

        Interrupted1 inte = new Interrupted1();
        inte.start();
        inte.interrupt();
    }
}
