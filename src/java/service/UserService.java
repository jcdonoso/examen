/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Usuario;
import dao.DAOFactory;
import interfaces.UserDAO;
import java.util.List;

/**
 *
 * @author dany
 */
public class UserService {
    // Select mysql to work
    DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
    
    // Implements methods using selected DB
    UserDAO userDAO = factory.getUserDAO();
    
    public int create(Usuario u){
        return userDAO.create(u);
    }
    public int update(Usuario u){
        return userDAO.update(u);
    }
    public int delete(Usuario u){
        return userDAO.delete(u);
    }
    public Usuario get(int id){
        return userDAO.get(id);
    }
    public List<Usuario> getAll(){
        return userDAO.getAll();
    }
    public Usuario findByEmail(String email){
        return userDAO.findByEmail(email);
    }
    public Usuario findByName (String name){
        return userDAO.findByName(name);
    }
}
