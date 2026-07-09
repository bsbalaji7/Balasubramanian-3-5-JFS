package JPA1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchUserById {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/userdb";
        String user = "root";
        String pass = "admin";

        try {

            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, user, pass);

            // SQL Query
            String sql = "SELECT * FROM users WHERE id = ?";

            // Create PreparedStatement
            PreparedStatement ps = con.prepareStatement(sql);

            // Set ID
            ps.setInt(1, 1);

            // Execute Query
            ResultSet rs = ps.executeQuery();

            // Display Record
            if (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println("ID : " + id);
                System.out.println("Name : " + name);
                System.out.println("Email : " + email);

            } else {

                System.out.println("User Not Found");
            }

            // Close Connection
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}