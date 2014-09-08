package database.Tables;

import java.sql.ResultSet;
import java.sql.SQLException;

public class users {
    public static void displayData(ResultSet rs) throws SQLException{
        while(rs.next()){
            //StringBuffer buffer = new StringBuffer();
            
            //buffer.append("User " + rs.getInt("ID"));
            System.out.println("User: " + rs.getString("USER"));
            System.out.println("\tID: " + rs.getInt("ID"));
            System.out.println("\tPassword: " + rs.getString("PASSWORD"));
            System.out.println("\tTime joined: " + rs.getInt("TIME_JOINED"));
            System.out.println();
        }
    }
}
