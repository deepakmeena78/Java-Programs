public class Timer2 extends Thread {
    public static void main(String[] args) {
        try {
            for (int horse = 0; horse <= 23; horse++) {
                for (int minut = 0; minut <= 59; minut++) {
                    for (int second = 0; second <= 59; second++) {
                        for (int nano = 0; nano <= 10; nano++) {
                            Thread.sleep(100);
                            System.out.format(" %02d : %02d : %02d : %02d\r", horse, minut, second, nano);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
