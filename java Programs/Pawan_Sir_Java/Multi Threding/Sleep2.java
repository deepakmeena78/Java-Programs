public class Sleep2 extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (InterruptedException a) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        
        Sleep2 sleep2 = new Sleep2();
        sleep2.start();
    }
}
