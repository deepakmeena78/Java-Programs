package Frontend;

import Backend.Cricket;
import java.util.Scanner;

public class CricketF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Overs : ");
        long Over = sc.nextLong();

        System.out.println("Enter Ball : ");
        long Ball = sc.nextLong();

        System.out.println("Enter Runs : ");
        long Runs = sc.nextLong();

        System.out.println("Enter BatsMan : ");
        String BatsMan = sc.next();

        System.out.println("Enter Bowler : ");
        String Bowler = sc.next();

        System.out.println("Enter Non Striker : ");
        String NonStriker = sc.next();

        Cricket cr = new Cricket(Over, Ball, Runs, BatsMan, Bowler, NonStriker);

        System.out.println("Over : " + cr.getOver());
        System.out.println("Ball : " + cr.getBall());
        System.out.println("Runs : " + cr.getRuns());
        System.out.println("BatsMan : " + cr.getBatsman());
        System.out.println("Bowler : " + cr.getBowler());
        System.out.println("Non Striker : " + cr.getNonStriker());
    }
}
