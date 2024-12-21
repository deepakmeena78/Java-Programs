package Frontend;

import Backend.Area;
import java.util.Scanner;

public class AreaF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius Interger : ");
        int rad = sc.nextInt();

        System.out.println("Enter Radius Interger : ");
        double rad2 = sc.nextDouble();

        Area af = new Area(rad, rad2);
        System.out.print(af.getRad3()+"  :  ");
        System.out.println(af.getRad4());
        System.out.print(af.getRad()+"  :  ");
        System.out.println(af.getRad2());
    }
}
