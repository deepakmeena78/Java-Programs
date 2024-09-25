class T1 extends Thread {
    public void run() {
        System.out.println("Class T1");
    }
}

class T2 extends Thread {
    public void run() {
        System.out.println("Class T2");
    }
}

public class Practice3 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.start();
        T2 t2 = new T2();
        t2.start();
    }
}
