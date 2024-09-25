public class Join2 extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                join(2000);
                System.out.println("Run");
            }
        } catch (Exception a) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        
        Join2 joi2 = new Join2();
        joi2.start();
    }
}
