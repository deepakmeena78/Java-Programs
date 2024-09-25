package Banking;

import java.sql.*;
import java.util.Scanner;

public class Login {

    double amountvalue = 0;
    String acountnumber = "";

    public void login() {
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Banking", "root", "Ankit@123");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM costomer WHERE Ac_No = ? ;");

            System.out.println("Enter Account No.");
            String a = sc.next();
            ps.setString(1, a);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("Name");
                System.out.println("User Name : " + name);

                String address = rs.getString("Address");
                System.out.println("Address : " + address);

                String mobile = rs.getString("Mo_No");
                System.out.println("Mobile Number : " + mobile);

                String accont = rs.getString("Ac_No");
                System.out.println("Account Number : " + accont);

                double amount1 = rs.getDouble("Amount");
                System.out.println("Account Balance : " + amount1);
                this.amountvalue = amount1;
                this.acountnumber = accont;
            }

            System.out.println("Deposit Amount : Press 1");
            System.out.println("Withdraw Amount : Press 0");
            System.out.println("Transfer Amount : Press 2");
            int input = sc.nextInt();

            if (input == 1) {

                Deposit d = new Deposit();
                d.deposit(acountnumber, amountvalue);

            } else if (input == 0) {

                Withdraw wi = new Withdraw();
                wi.withdraw(acountnumber, amountvalue);

            } else {
                System.out.println("Enter Right Input");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
