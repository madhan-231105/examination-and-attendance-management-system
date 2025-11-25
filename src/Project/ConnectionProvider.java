package Project;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getcon() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "madhan123");
            return con;
        } 
        catch (Exception e) {
            // Print the exception for debugging purposes
            e.printStackTrace();
            return null;
        }
    }
}
