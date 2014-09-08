package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String USERNAME = "pv1admin";
    private static final String PASSWORD = "pv1adminpass";
    private static final String CONN_STRING_mysql = "jdbc:mysql://localhost/pv1";
    private static final String CONN_STRING_sqlite = "jdbc:sqlite:practice.db";

    public static Connection getConnection_mysql() throws SQLException {
        return DriverManager.getConnection(CONN_STRING_mysql, USERNAME, PASSWORD);
    }
    public static Connection getConnection_sqlite() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        return DriverManager.getConnection(CONN_STRING_sqlite);
    }

    public static void processException(SQLException e) {
        System.err.println("Error message: " + e.getMessage());
        System.err.println("Error code: " + e.getErrorCode());
        System.err.println("SQL state: " + e.getSQLState());
    }
}
