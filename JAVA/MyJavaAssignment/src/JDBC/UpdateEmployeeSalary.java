package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateEmployeeSalary {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String pass = "admin";

        try {

            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, user, pass);

            // SQL Update Query
            String sql = "UPDATE employee SET salary = ? WHERE department = ?";

            // Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(sql);

            // Set Values
            ps.setDouble(1, 50000);     // New Salary
            ps.setString(2, "HR");      // Department Name

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