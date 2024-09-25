class Temp {
    int totalseat = 20;

    synchronized void book(int seat) {
        if (totalseat >= seat) {
            System.out.println("Seat Booked Successfully");
            totalseat = totalseat - seat;
            System.out.println("Left Seat : " + totalseat);
        } else {
            System.out.println("Not Space On Tacize");
        }
    }
}

public class Synchronization3 extends Thread {

    static Temp t;
    int seat;

    public void run() {
        t.book(seat);
    }

    public static void main(String[] args) {
        t = new Temp();
        Synchronization3 t1 = new Synchronization3();
        t1.seat = 4;
        t1.start();

        Synchronization3 t2 = new Synchronization3();
        t2.seat = 6;
        t2.start();

        Synchronization3 t3 = new Synchronization3();
        t3.seat = 8;
        t3.start();
    }
}
