

package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStudent {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String pass = "admin";

        try {

            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, user, pass);

            // SQL Query
            String sql = "INSERT INTO student(id, name, marks) VALUES (?, ?, ?)";

            // PreparedStatement
            PreparedStatement ps = con.prepareStatement(sql);

            // Set Values
            ps.setInt(1, 101);
            ps.setString(2, "Bala");
            ps.setFloat(3, 90);

            // Execute Query
            int i = ps.executeUpdate();

            System.out.println(i + " Record Inserted Successfully");

            // Close Connection
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}