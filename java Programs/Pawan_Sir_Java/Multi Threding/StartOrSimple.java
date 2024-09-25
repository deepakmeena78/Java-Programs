class my extends Thread {
    public void run() {
        System.out.println("Run 1");
    }

    public void start(int i) {
        System.out.println("int Run 1");
    }
}

public class StartOrSimple {
    public static void main(String args[]) {
        my m = new my();
        m.start();
        m.start(0);
    }
}
