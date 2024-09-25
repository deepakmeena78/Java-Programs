package Bakend;

import banking.Balance;
import java.sql.*;
import javax.swing.*;

public class ShowData {
    public void showdata(String account1,String password1){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Banking", "root", "Ankit@123");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM user WHERE Account = ? OR password = ?;");
            
            ps.setString(1, account1);
            ps.setString(2, password1);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String adhar = rs.getString("adhar");

                String name = rs.getString("Name");

                String mobile = rs.getString("Mobile_No");

                String address = rs.getString("Address");

                String gender = rs.getString("Gender");

                String account = rs.getString("Account");
                
                String password11 = rs.getString("password");

                String balance = rs.getString("balance");

                Balance b = new Balance();
                b.setData(adhar, name, mobile, address, gender, account,password11,balance);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}