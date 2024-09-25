class mythed implements Runnable {
    public void run() {
        System.out.println("Child Class");
    }
}

public class RunOrStart {
    public static void main(String args[]) {
        mythed thr = new mythed();
        Thread th = new Thread(thr);
        th.start();
    }
}