package model;

import db.MysqlConnection;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends MysqlConnection {

    public boolean autentificacion(String rutUsuario, String password) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            conn = MysqlConnection.open();
            String consulta = "select * from usuarios where rut = ? and contrasena = ?";
            ps = conn.prepareStatement(consulta);
            ps.setString(1, rutUsuario);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.absolute(1)) {
                return true;
            }
        } catch (Exception e) {
            System.err.println("error" + e);
        } finally {

            try {
                if (conn != null) {
                    conn.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.err.println("error" + e);
            }

        }

        return false;
    }

//    public static void main(String[] args) {
//
//        Login l = new Login();
//
//        System.out.println(l.autentificacion("mfuentes","mfuentes"));
//    }
}
