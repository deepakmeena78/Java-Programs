public class Timer extends Thread {
    public static void main(String[] args) throws InterruptedException {
        // Time ob = new Time();
        int sec = 0, mint = 0, hour = 0;
        System.out.println("hour mint  sec");
        while (true) {
            if (sec == 60) {
                mint++;
                sec = 0;
            }
            if (mint == 60) {
                mint = 0;
                hour++;
            }
            if (hour == 24) {
                hour = 0;
            }
            System.out.format(" %02d : %02d : %02d\r", hour, mint, sec);
            Thread.sleep(1000);
            sec++;
        }
    }
}
