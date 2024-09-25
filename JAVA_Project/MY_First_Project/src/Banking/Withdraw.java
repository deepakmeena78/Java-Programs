package Banking;

import java.sql.*;
import java.util.Scanner;

public class Withdraw {

    public void withdraw(String ac, double amount1) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Banking", "root", "Ankit@123");
            String in = "UPDATE costomer SET Amount = ? WHERE Ac_no = ?";
            PreparedStatement ps = con.prepareStatement(in);

            String temp2 = ac;

            System.out.println("confirm Account Number : ");
            String acn = sc.next();

            System.out.println("Enter Withdraw Amount");
            double withdraw1 = sc.nextDouble();

            double newdeposit = 0;
            if (withdraw1 < amount1) {
                newdeposit = amount1 - withdraw1;

                if (acn.equals(ac)) {
                    ps.setDouble(1, newdeposit);
                    ps.setString(2, acn);
                } else {
                    System.out.println("Check Your Account Number");
                    Deposit de = new Deposit();
                    de.deposit(temp2, amount1);
                }
            } else {
                System.out.println("Account Balance Low");
            }

            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Withdraw Is Successfully");
                System.out.println("Account No. : " + ac);
                System.out.println("Withdraw Amount : " + withdraw1);
            } else {
                System.out.println("Failed");

            }
        } catch (Exception a) {
            System.out.println(a);
        }
    }
}
