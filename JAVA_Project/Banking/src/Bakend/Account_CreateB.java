package Bakend;

import java.sql.*;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Account_CreateB {

    public void account_create(String adhar, String name, String mobile, String address, String gender,String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Banking", "root", "Ankit@123");
            String in = "INSERT INTO user (adhar,Name,Mobile_No,Address,Gender,Account,password) VALUES (?, ?, ?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(in);            
            
                long number = Long.parseLong(mobile);
                number = number * 2;
                String account = String.valueOf(number);

            ps.setString(1, adhar);
            ps.setString(2, name);
            ps.setString(3, mobile);
            ps.setString(4, address);
            ps.setString(5, gender);
            ps.setString(6, account);
            ps.setString(7, password);

            int i = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
