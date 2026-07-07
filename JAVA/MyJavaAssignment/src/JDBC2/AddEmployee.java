package JDBC2;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class AddEmployee {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String pass = "admin";

        try {

            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, user, pass);

            // CallableStatement for Stored Procedure
            CallableStatement cs = con.prepareCall("{call addEmployee(?,?,?,?)}");

            // Set Values
            cs.setInt(1, 101);
            cs.setString(2, "Bala");
            cs.setString(3, "HR");
            cs.setDouble(4, 45000);

            // Execute Procedure
            cs.execute();

            System.out.println("Employee Record Inserted Successfully");

            // Close Connection
            cs.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
