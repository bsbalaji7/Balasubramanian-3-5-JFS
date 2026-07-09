package JPA1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchUsers {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/userdb";
        String user = "root";
        String pass = "admin";

        try {

            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, user, pass);

            // Create Statement
            Statement st = con.createStatement();

            // SQL Select Query
            String sql = "SELECT * FROM users";

            // Execute Query
            ResultSet rs = st.executeQuery(sql);

            // Display Records
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println(id + " " + name + " " + email);
            }

            // Close Connection
            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
