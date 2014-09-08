package database;

import database.Tables.pictures;
import database.Tables.users;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    public static void main(String[] args) throws SQLException {
            DBUsersPrint();
            DBPicturesPrint();
        
    }
    
    public static void DBUsersPrint(){
        try (   Connection conn = DBUtil.getConnection_mysql();
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery("SELECT * FROM users");) 
        {
            users.displayData(rs);
        } catch (SQLException ex) {
            DBUtil.processException(ex);
        }
    }
    public static void DBPicturesPrint(){
        try (   Connection conn = DBUtil.getConnection_mysql();
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery("SELECT * FROM pictures");) 
        {
            pictures.displayData(rs);
        } catch (SQLException ex) {
            DBUtil.processException(ex);
        }
    }
    
}
