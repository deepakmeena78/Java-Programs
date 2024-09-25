package MYpack;

import java.sql.*;
import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter New City Name");
        String city1 = sc.nextLine();

        System.out.println("Enter Email Proof");
        String email1 = sc.nextLine();
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/infobeans", "root", "Ankit@123");
            String in = ("UPDATE student SET city =? WHERE email =?");
            PreparedStatement ps = con.prepareStatement(in);
            ps.setString(1, city1);
            ps.setString(2, email1);
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("success update");
            } else {
                System.out.println("Fail");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
