public class Sleep4 extends Thread {

    public void run() {
        try {
            Thread.sleep(1000);
            for (int i = 1; i <= 5; i++) {
                System.out.println("Run Method  " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        Sleep4 sleep4 = new Sleep4();
        sleep4.start();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main Method  " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
