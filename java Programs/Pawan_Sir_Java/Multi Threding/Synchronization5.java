class Profit extends Thread {

    int total;

    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total = total + 100;
            }
            this.notify();
        }
    }
}

public class Synchronization5 {
    public static void main(String[] args) {

        Profit pr = new Profit();
        pr.start();

        synchronized(pr){
            try {
                pr.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(pr.total);
        }
    }
}
