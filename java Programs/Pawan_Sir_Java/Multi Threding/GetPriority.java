public class GetPriority extends Thread {
    public void run(){
        System.out.println("Child Method");
        System.out.println(Thread.currentThread().getPriority() );
    }
    public static void main(String[] args) {

        System.out.println("Main Method");

        System.out.println(Thread.currentThread().getPriority());
        GetPriority dee5 = new GetPriority();
        dee5.start();
    }
}
