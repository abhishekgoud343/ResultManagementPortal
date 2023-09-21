package result_portal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    static Connection connection = null;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if (connection != null && !connection.isClosed())
            return connection;

        String user = "root"; //replace the string value with your MySQL server username
        String pwd = "password"; //replace the string value with your MySQL server password
        String db = "srms";

        return getConnection(user, pwd, db);
    }

    private static Connection getConnection(String user, String pwd, String db) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/" + db + "?user=" + user + "&password=" + pwd);

        return connection;
    }
}