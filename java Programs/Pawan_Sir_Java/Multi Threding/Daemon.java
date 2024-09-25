public class Daemon extends Thread {

    public void run(){
        System.out.println("Run Method");
    }
    public static void main(String[] args) {

        System.out.println("Main Method");
        Daemon dee3 = new Daemon();
        dee3.setDaemon(true);
        dee3.start();
    }
}
