package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import db.MysqlConnection;


public class Usuario{

    private int idUsuario;
    private String rut;
    private String nombre;
    private String email;
    private String contrasena;
    private int dinero;
    private int tipoUsuario;

    public Usuario() {
        
    }

    public Usuario(String rut, String nombre, String email, String contrasena, int dinero, int tipoUsuario) {
        this.rut = rut;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.dinero = dinero;
        this.tipoUsuario = tipoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
   
}
