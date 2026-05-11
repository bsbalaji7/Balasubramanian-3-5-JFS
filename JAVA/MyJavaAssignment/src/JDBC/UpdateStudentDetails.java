package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateStudentDetails {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String pass = "admin";

        try {

            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, user, pass);

            // SQL Update Query
            String sql = "UPDATE student SET name = ?, marks = ? WHERE id = ?";

            // Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(sql);

            // Set Values
            ps.setString(1, "Arun");   // New Name
            ps.setFloat(2, 95);        // New Marks
            ps.setInt(3, 101);         // Student ID

            // Execute Update
            int i = ps.executeUpdate();

            System.out.println(i + " Record Updated Successfully");

            // Close Connection
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}