/*package co.edu.sena.tallerjava.util;

import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class UseBasicConnectionSingleton {
    public static void main(String[] args) throws
            SQLException {
        try (Connection conn = BasicConnectionSingleton.getInstance();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM  my_app.users_tbl")) {
 while (rs.next()) {

            System.out.print(rs.getString("user_firstname"));
            System.out.print(" | ");
            System.out.println(rs.getString("user_lastname"));
        }
    } // end try
}
}*/