package JDBC2;

import java.sql.*;

public class StoredProcedureExample {
    public static void main(String[] args) {

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "admin"
            );

            // Prepare Callable Statement
            CallableStatement cs = con.prepareCall("{call insertStudent(?,?,?)}");

            // Set Values
            cs.setInt(1, 101);
            cs.setString(2, "Bala");
            cs.setInt(3, 95);

            // Execute Procedure
            cs.execute();

            System.out.println("Student record inserted successfully");

            // Close Connection
            cs.close();
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
