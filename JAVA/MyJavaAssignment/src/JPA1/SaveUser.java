package JPA1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SaveUser {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/userdb";
        String user = "root";
        String pass = "admin";

        try {

            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, user, pass);

            // SQL Insert Query
            String sql = "INSERT INTO users(id, name, email) VALUES(?,?,?)";

            // Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(sql);

            // Set Values
            ps.setInt(1, 1);
            ps.setString(2, "Bala");
            ps.setString(3, "bala@gmail.com");

            // Execute Query
            int i = ps.executeUpdate();

            System.out.println(i + " User Saved Successfully");

            // Close Connection
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}