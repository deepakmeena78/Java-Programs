package Frontend;

import java.util.Scanner;
import Backend.Details;

public class DetailsF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.next();

        System.out.println("Enter City");
        String city = sc.next();

        System.out.println("Enter Mobile No.");
        String add = sc.next();

        System.out.println("Enter PinCode");
        int pincode = sc.nextInt();

        Details dl = new Details(name, city, add, pincode);

        System.out.println("Name : " + dl.getName() + "\nCity : " + dl.getCity() + "\nAddress : " + dl.getMobile()+ "\nPincode : " + dl.getPincode());

    }
}
