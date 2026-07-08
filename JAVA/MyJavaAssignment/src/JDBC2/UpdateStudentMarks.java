package JDBC2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class UpdateStudentMarks {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String pass = "admin";

        try {

            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, user, pass);

            // Call Stored Procedure
            CallableStatement cs = con.prepareCall("{call updateMarks(?,?)}");

            // Set Input Parameters
            cs.setInt(1, 101);     // Student ID
            cs.setFloat(2, 95);    // New Marks

            // Execute Procedure
            cs.execute();

            System.out.println("Student Marks Updated Successfully");

            // Close Connection
            cs.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}