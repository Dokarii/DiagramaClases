package org.example.fitjourney.util;
import java.sql.*;
//Singleton
public class DatabaseConnection {
    private static final String url = "jdbc:mysql://localhost:3306/FitJourney";
    private static final String user = "root";
    private static final String pass = "12345";
    private static Connection myConn;

    public static Connection getIntance() throws SQLException {
        if (myConn == null){
            myConn = DriverManager.getConnection(url,user,pass);
        }
        return myConn;
    }
}