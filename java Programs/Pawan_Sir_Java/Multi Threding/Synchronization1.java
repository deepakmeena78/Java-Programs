public class Synchronization1 extends Thread {

    int seat;
    public void run() {
        System.out.println(seat);
    }

    public static void main(String[] args) {

        Synchronization1 srz = new Synchronization1();
        srz.start();
        srz.seat=7;
    }
}