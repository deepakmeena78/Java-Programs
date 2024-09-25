class Test extends Thread{
    public void run(){
        System.out.println("Tread Class");
    }
}
public class Thread2Execute {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        Test t1 = new Test();
        t1.start();
    }
}
