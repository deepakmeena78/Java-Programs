package MYpack;

import java.sql.*;

public class Get {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/infobeans", "root", "Ankit@123");
        PreparedStatement ps = con.prepareStatement("select * from student;");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String email1 = rs.getString("email");
            System.out.println("email : " + email1);

            String id1 = rs.getString("id");
            System.out.println("id : " + id1);

            String name = rs.getString("std_name");
            System.out.println("std_student : " + name);

            String post = rs.getString("std_post");
            System.out.println("post : " + post);

            String salary1 = rs.getString("salary");
            System.out.println("salary : " + salary1);

            String city1 = rs.getString("city");
            System.out.println("city : " + city1);

            String job = rs.getString("job_id");
            System.out.println("job : " + job);
            System.out.println("--------------------------------------------");
        }
        con.close();
    }
}
