import java.util.Scanner;

class Movie {           //without Synchronization Problem
    int totolseat = 20;
    
        void book(int seat) {
        if (totolseat >= seat) {
            System.out.println(seat + " Seats Booked Successfully");
            totolseat = totolseat - seat;
            System.out.println("Seats Left : " + totolseat);
        } else {
            System.out.println("Only Total Space 20 : ");
        }
    }
}

public class Synchronization2 extends Thread {

    static Movie M;
    int seats;

    public void run() {
        M.book(seats);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Seats");
        int a = sc.nextInt();
        M = new Movie();

        Synchronization2 c1 = new Synchronization2();
        c1.seats = a;
        c1.start();

        Synchronization2 c2 = new Synchronization2();
        c2.seats = 5;
        c2.start();

        Synchronization2 c3 = new Synchronization2();
        c3.seats = 3;
        c3.start();
    }
}