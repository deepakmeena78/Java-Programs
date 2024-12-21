package Frontend;

import Backend.UserAll;
import java.util.Scanner;

public class UserAllF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Value : ");
        int value = Integer.parseInt(sc.nextLine());
        
        UserAll arr[] = new UserAll[value];
        for (int i = 0; i < arr.length; i++) {

            System.out.println("Enter PinCode : ");
            long pincode = Long.parseLong(sc.nextLine());

            System.out.println("Enter Name : ");
            String name = sc.nextLine().toUpperCase();

            System.out.println("Enter Location : ");
            String location = sc.nextLine().toUpperCase();

            System.out.println("Enter Price : ");
            double price = Double.parseDouble(sc.nextLine());

            System.out.println("Enter Contact : ");
            long contact = Long.parseLong(sc.nextLine());

            arr[i] = new UserAll(pincode, name, location, price, contact);
        }

        for (UserAll x : arr) {
            if (x.getPrice() >= 5000) {
                System.out.println("5000 Greater : " + x.getPrice());
            }
        }

        for (UserAll x : arr) {
            char ch = x.getName().charAt(0);
            String str = x.getName().toLowerCase();
            if (ch == 'D') {
                System.out.println("Start a : " + str);
            }
        }

        for (UserAll x : arr) {
            String str = x.getName();
            char ch = str.charAt(str.length() - 1);
            if (ch == 'A') {
                System.out.println("End a : " + str);
            }
        }

        for (UserAll x : arr) {
            if (x.getLocation() == "INDORE" || x.getLocation() == "GOA") {
                System.out.println("Start a : " + x.getName());
            }
        }
    }
}
