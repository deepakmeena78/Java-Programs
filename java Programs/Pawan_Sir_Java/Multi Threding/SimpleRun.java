class MyThred extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Child Class");
        }
    }

}

public class SimpleRun{
        public static void main(String[] args) {
            for(int i = 0;i<=10;i++){
                System.out.println("Main Class");
            }
            MyThred m = new MyThred();
            m.run();
        }
    }