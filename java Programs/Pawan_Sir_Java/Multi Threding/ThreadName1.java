public class ThreadName1 extends Thread {

    public void run(){
        System.out.println("Thread Excude By "+Thread.currentThread().getName());
    }    
    public static void main(String[] args) {

        System.out.println("Excude By "+Thread.currentThread().getName());
        
        ThreadName1 dee1 = new ThreadName1();
        dee1.setName("Ankit");
        dee1.start();

        ThreadName1 dee2 = new ThreadName1();
        dee2.start();

        ThreadName1 dee3 = new ThreadName1();
        dee3.start();
    }
}
