package Backend;

import java.util.Locale;
import java.util.Scanner;

class PremiumCustomer {
    
    private int points;
    
    public PremiumCustomer(int points) {
        this.points = points / 10;
    }
    
    public int getPoints() {
        return points;
    }
    
    public void m1(String d) {
        if (d.equals("yes")) {
            System.out.println("Premium Customer : " + points * 2);
        } else if (d.equals("no")) {
            System.out.println("Normal Customer : " + points);
        } else {
            System.out.println("Invid Values : ");
        }
    }
}

public class Customer {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        
        System.out.println("Enter Value : ");
        int num = Integer.parseInt(sc.nextLine());
        
        PremiumCustomer p = new PremiumCustomer(num);
        
        System.out.println("Customer Is Premium Yes/NO ");
        String s = sc.nextLine().toLowerCase();
        
        p.m1(s);
    }
}
