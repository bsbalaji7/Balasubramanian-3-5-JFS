package JPA1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdatedUsers {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/userdb";
        String user = "root";
        String pass = "admin";

        try {

            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, user, pass);

            // SQL Update Query
            String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";

            // Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(sql);

            // Set Values
            ps.setString(1, "Arun");
            ps.setString(2, "arun@gmail.com");
            ps.setInt(3, 1);

            // Execute Update
            int i = ps.executeUpdate();

            System.out.println(i + " User Updated Successfully");

            // Close Connection
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}