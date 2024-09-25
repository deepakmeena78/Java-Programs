public class SleepTimer3 {
    public static void main(String[] args) {
        try {
            for(int i = 0;i<=1000;i++){
                for(int j = 0;j <= 59;j++){
                    Thread.sleep(1000);
                    System.out.println(i+" "+j);
                }
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
