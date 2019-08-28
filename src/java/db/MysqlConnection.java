package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MysqlConnection {

    private static Connection con;
    private static final String DB = "prestamista";
    private static final String USR = "root";
    private static final String PASS = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/" + DB;
    public static Connection open() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USR, PASS);
        } catch (ClassNotFoundException ce) {
            System.out.println("Class not found Check jdbc Driver");
        }  catch (SQLException e) {
            System.out.println("Connection error..."+e.getMessage());
            throw e;
        }
        return con;
    }
   
    public static void close() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println("Error: No se logro cerrar la conexion: "+e);
        }
 
    }   
 
}
