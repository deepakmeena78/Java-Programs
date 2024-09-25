public class Sleep6 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println(i + " : " + Thread.currentThread().getName());
            }
        } catch (Exception a) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        Sleep6 sleep6 = new Sleep6();//Normal Method Call
        sleep6.run();
        Sleep6 slee6 = new Sleep6();
        slee6.run();
    }
}