package JDBC2;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class InsertUser {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/userdb";
        String user = "root";
        String pass = "admin";

        try {

            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, user, pass);

            // Call Stored Procedure
            CallableStatement cs = con.prepareCall("{call addUser(?,?,?)}");

            // Set Input Parameters
            cs.setInt(1, 1);
            cs.setString(2, "Bala");
            cs.setString(3, "bala@gmail.com");

            // Execute Procedure
            cs.execute();

            System.out.println("User Record Inserted Successfully");

            // Close Connection
            cs.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}