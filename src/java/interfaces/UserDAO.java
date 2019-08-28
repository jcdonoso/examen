/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import model.Usuario;
import java.util.List;

/**
 *
 * @author dany
 */
public interface UserDAO {
    
    public int create(Usuario u);
    public int update(Usuario u);
    public int delete(Usuario u);
    public Usuario get(int id);
    public List<Usuario> getAll();
    public Usuario findByEmail(String email);
    public Usuario findByName (String name);
    public Usuario obtUsuarioXrut(String rut);
}
