public class Sleep5 extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println(i + "  :" + Thread.currentThread().getName());
            }
        } catch (Exception a) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        Sleep5 sleep5 = new Sleep5();
        sleep5.start();
        Sleep5 slee5 = new Sleep5();
        slee5.start();
    }
}