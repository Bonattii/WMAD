import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/employee_db";
        String user = "root";
        String password = """;

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("SQL server succesfully connected.");
    }
}
