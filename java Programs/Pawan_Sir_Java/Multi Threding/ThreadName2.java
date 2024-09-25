public class ThreadName2 extends Thread {
    public void run() {
        System.out.println("Child Method");
    }

    public static void main(String[] args) {

        System.out.println("Main Method");

        ThreadName2 dee4 = new ThreadName2();
        dee4.setDaemon(true);
        dee4.start();
    }
}
