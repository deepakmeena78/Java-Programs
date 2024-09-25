class Tacize1 { // First Class
    static int totalseat = 20;

    static synchronized void seatbook(int seat) {
        if (totalseat >= seat) {
            System.out.println(seat + " : Booked Successfully");
            totalseat = totalseat - seat;
            System.out.println("Left Seat : " + totalseat);
        } else {
            System.out.println("Not Available Seats");
        }
    }
}

class Tacize2 extends Thread { // Second Class

    Tacize1 t1;
    int seat;

    Tacize2(Tacize1 t1, int seat) {
        this.t1 = t1;
        this.seat = seat;
    }

    public void run() {
        t1.seatbook(seat);
    }
}

class Tacize3 extends Thread { // Third Class

    Tacize1 t1;
    int seat;

    Tacize3(Tacize1 t1, int seat) {
        this.t1 = t1;
        this.seat = seat;
    }

    public void run() {
        t1.seatbook(seat);
    }
}

public class Synchronization4 { // Main Class
    public static void main(String[] args) {

        Tacize1 Z1 = new Tacize1();
        Tacize2 Z2 = new Tacize2(Z1, 7);
        Z2.start();

        Tacize3 Z3 = new Tacize3(Z1, 6);
        Z3.start();

        // ------------------------------------

        Tacize1 Z11 = new Tacize1();
        Tacize2 Z22 = new Tacize2(Z1, 4);
        Z22.start();

        Tacize3 Z33 = new Tacize3(Z1, 6);
        Z33.start();
    }
}