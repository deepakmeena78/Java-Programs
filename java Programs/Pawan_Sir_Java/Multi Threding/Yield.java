public class Yield extends Thread {

    public void run() {
        Thread.yield();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "_" + i);
        }
    }

    public static void main(String[] args) {

        Yield dee6 = new Yield();
        dee6.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "_" + i);
        }
    }
}