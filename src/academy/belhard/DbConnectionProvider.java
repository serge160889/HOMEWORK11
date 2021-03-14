package academy.belhard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionProvider {
    public static final String URL = "jdbc:mysql://localhost:3306/addresses_db?useUnicode=true&serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASS = "root";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
