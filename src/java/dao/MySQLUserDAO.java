/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Usuario;
import db.MysqlConnection;
import interfaces.UserDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dany
 */
public class MySQLUserDAO implements UserDAO {

    final String SELECTALL = "SELECT * FROM usuarios";
    final String SELECTBYID = "SELECT * FROM usuarios WHERE id = ?";
    final String SELECTUSERBYRUT = "SELECT * FROM usuarios WHERE rut = ?";
    final String CREATE = "INSERT INTO usuarios (rut,nombre,email,contrasena,dinero,tipo_usuario) VALUES (?,?,?,?,?,?)";

    final String UPDATE = "UPDATE user SET nombre = ?, email = ?, password = ? WHERE id = ?";

    @Override
    public int create(Usuario u) {
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            
            conn = MysqlConnection.open();
            
            ps = conn.prepareStatement(this.CREATE);
            //ps = conn.prepareStatement("INSERT INTO usuarios (rut,nombre,email,contrasena,dinero,tipo_usuario) VALUES (?,?,?,?,?,?)");
            ps.setString(1, u.getRut());
            ps.setString(2, u.getNombre());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getContrasena());
            ps.setInt(5, u.getDinero());
            ps.setInt(6, u.getTipoUsuario());
            rs = ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error SQL" + ex.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error Closing" + ex.getMessage());
            }
        }
        return rs;
    }

    @Override
    public int update(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario get(int id) {
        Usuario u = null;

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = MysqlConnection.open();
            ps = conn.prepareStatement(this.SELECTBYID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u = new Usuario();
                u.setIdUsuario(rs.getInt("id_usuario"));
                u.setRut(rs.getString("rut"));
                u.setNombre(rs.getString("nombre"));
                u.setEmail(rs.getString("email"));
                u.setContrasena(rs.getString("contrasena"));
                u.setContrasena(rs.getString("dinero"));
                u.setContrasena(rs.getString("tipo_usuario"));
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL" + ex.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error Closing" + ex.getMessage());
            }
        }

        return u;
    }

    @Override
    public List<Usuario> getAll() {
        List<Usuario> lu = new ArrayList<>();
        Connection conn = null;
        Statement ps = null;
        try {
            conn = MysqlConnection.open();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(this.SELECTALL);
            while (rs.next()) {
                Usuario u = new Usuario();
                u.setIdUsuario(rs.getInt("id_usuario"));
                u.setRut(rs.getString("rut"));
                u.setNombre(rs.getString("nombre"));
                u.setEmail(rs.getString("email"));
                u.setContrasena(rs.getString("password"));
                u.setContrasena(rs.getString("dinero"));
                u.setContrasena(rs.getString("tipo_usuario"));
                lu.add(u);
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL" + ex.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error Closing" + ex.getMessage());
            }
        }
        return lu;
    }

    @Override
    public Usuario findByEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public Usuario obtUsuarioXrut(String rut) {
        Usuario u = null;

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = MysqlConnection.open();
            ps = conn.prepareStatement(this.SELECTUSERBYRUT);
            ps.setString(1,rut);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u = new Usuario();
                u.setIdUsuario(rs.getInt("id_usuario"));
                u.setRut(rs.getString("rut"));
                u.setNombre(rs.getString("nombre"));
                u.setEmail(rs.getString("email"));
                u.setContrasena(rs.getString("contrasena"));
                u.setDinero(rs.getInt("dinero"));
                u.setTipoUsuario(rs.getInt("tipo_usuario"));
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL" + ex.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error Closing" + ex.getMessage());
            }
        }

        return u;
    }
}
