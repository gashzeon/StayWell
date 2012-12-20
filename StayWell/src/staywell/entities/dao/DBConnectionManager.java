package staywell.entities.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {
	static Connection con;
    static String url;
    public static Connection getConnection() {
     
        try {
            String url = "jdbc:mysql://localhost:8888/mydatabase";
            // assuming "DataSource" is your DataSource name

            Class.forName("com.mysql.jdbc.Driver");

            try {
                con = DriverManager.getConnection(url, "myuser", "0000");
            }

            catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        catch (ClassNotFoundException e) {// "logger" prints in to a file;
           
            System.out.println(e);
        }

        return con;
    }
}
