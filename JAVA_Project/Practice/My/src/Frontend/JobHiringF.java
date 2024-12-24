package Frontend;

import Backend.JobHiring;
import java.util.Scanner;

public class JobHiringF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Name");
        String name = sc.nextLine();

        System.out.println("Enter User Last Name");
        String lastname = sc.nextLine();

        System.out.println("Enter User Job ID");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Enter User Job Title");
        String title = sc.nextLine();

        JobHiring u = new JobHiring(name, lastname, id, title);
        u.display();
    }
}
