package MYpack;

import java.util.Scanner;
import java.sql.*;

public class DemoJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/infobeans", "root", "Ankit@123");
            String in = "INSERT INTO student (email, id, std_name, std_post, salary, city, job_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(in);

            System.out.println("Enter email: ");
            String email = sc.nextLine();

            System.out.println("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter name: ");
            String std_name = sc.nextLine();

            System.out.println("Enter position: ");
            String std_post = sc.nextLine();

            System.out.println("Enter salary: ");
            Float salary = sc.nextFloat();

            System.out.println("Enter city: ");
            sc.nextLine(); // consume newline
            String city = sc.nextLine();

            System.out.println("Enter Job Id: ");
            int job_id = sc.nextInt();

            ps.setString(1, email);
            ps.setInt(2, id);
            ps.setString(3, std_name);
            ps.setString(4, std_post);
            ps.setFloat(5, salary);
            ps.setString(6, city);
            ps.setInt(7, job_id);

            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Success");
            } else {
                System.out.println("Fail");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
