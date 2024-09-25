package Bakend;

import java.util.Scanner;
import java.sql.*;

public class DepositB {
    public void deposit(String ac, double amount1) {
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Banking", "root", "Ankit@123");
            String in = "UPDATE costomer SET Amount = ? WHERE Ac_no = ?";
            PreparedStatement ps = con.prepareStatement(in);

            String temp2 = ac;

            System.out.println("confirm Account Number : ");
            String acn = sc.next();

            System.out.println("Enter Deposit Amount");
            double amountt = sc.nextDouble();
            
            double newdeposit = amount1 + amountt;
            
            if (acn.equals(ac)) {
                ps.setDouble(1, newdeposit);
                ps.setString(2, acn);
            } else {
                System.out.println("Check Your Account Number");
                DepositB de = new DepositB();
                de.deposit(temp2, amount1);
            }

            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Deposit Is Successfully");
                System.out.println("Account No. : " + ac);
                System.out.println("Deposit Amount : " + amountt);
            } else {
                System.out.println("Failed");

            }
        } catch (Exception a) {
            System.out.println(a);
        }
    }
}
