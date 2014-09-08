package database.Tables;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class pictures {
    public static void displayData(ResultSet rs) throws SQLException{
        while(rs.next()){
            System.out.println("ID: " + rs.getInt("ID"));
            System.out.println("\tUPLOADERS_ID: " + rs.getInt("UPLOADERS_ID"));
//            System.out.println("\tFile location: " + rs.getString("FILE_LOCATION"));
            System.out.println("\tPavadinimas: " + rs.getString("PAVADINIMAS"));
            System.out.println("\tAprasymas: " + rs.getString("APRASYMAS"));
            System.out.println("\tTime: " + rs.getString("TIME_UPLOADED"));
//            System.out.println("\tFile name: " + rs.getString("FILE_NAME"));
            System.out.println("\tVisible: " + rs.getInt("VISIBLE"));
//            System.out.println("\tAukstis: " + rs.getInt("AUKSTIS"));
//            System.out.println("\tPlotis: " + rs.getInt("PLOTIS"));
            System.out.println();
        }
    }
}
