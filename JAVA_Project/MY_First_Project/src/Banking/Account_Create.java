package Banking;

import java.sql.*;
import java.util.Scanner;

public class Account_Create {

    public void create() {
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Banking", "root", "Ankit@123");
            String in = "INSERT INTO costomer (Name,Address,Mo_No,Ac_No) VALUES (?, ?, ?,?)";
            PreparedStatement ps = con.prepareStatement(in);

            System.out.println("Enter Name: ");
            String name = sc.nextLine();

            System.out.println("Enter Address : ");
            String ads = sc.next();

            System.out.println("Enter Mobile No.: ");
            String mb = sc.next();

            long type1 = Long.parseLong(mb);
            long temp = (type1 / 3) * 5;
            String ac = String.valueOf(temp);

            ps.setString(1, name);
            ps.setString(2, ads);
            ps.setString(3, mb);
            ps.setString(4, ac);

            int i = ps.executeUpdate();
            double defaultv = 0;
            if (i > 0) {
                System.out.println("Create Your Account");
                System.out.println("Your Name : " + name);
                System.out.println("Your Address : " + ads);
                System.out.println("Your Mobile No. : " + mb);
                System.out.println("Your Account No. : " + temp);
                System.out.println("Deposit Amount ? : yes / no");
                String yesno = sc.next().toLowerCase();

                if (yesno.equals("yes")) {
                    Deposit ds = new Deposit();
                    ds.deposit(ac, defaultv);
                } else if (yesno.equals("no")) {
                    System.out.println("Ok Thank You");
                } else {
                    System.out.println("Thank You To Visit");
                }
            } else {
                System.out.println("Fail");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
